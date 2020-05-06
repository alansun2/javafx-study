package com.alan344.lesson_34_text;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * TitledPane
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {


        TextField findText = new TextField();
        Button findBtn = new Button("查找");
        Button sortBtn = new Button("排序");
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(findText, findBtn, sortBtn);

        TextArea findTa = new TextArea();
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10));
        vBox.getChildren().addAll(hbox, findTa);


        BorderPane borderPane = new BorderPane();

        borderPane.setCenter(vBox);

        Scene scene = new Scene(borderPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        primaryStage.show();

        findBtn.setOnAction(event -> {
            String strForFind = findText.getText();
            ObservableList<CharSequence> list = findTa.getParagraphs();
            list.forEach(charSequence -> {
                String value = charSequence.toString();
                if (value.contains(strForFind)) {
                    findTa.requestFocus();
                    int i = value.indexOf(strForFind);
                    findTa.selectRange(i, i + strForFind.length());
                }
            });
        });
    }
}
