package com.alan344.lesson_36_choic;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main3 extends Application {
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
        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.setPrefWidth(100);

        ChoiceBox<String> cb2 = new ChoiceBox<>();
        cb2.setPrefWidth(100);

        ObservableList<String> strings = FXCollections.observableArrayList();
        strings.add("上海");
        strings.add("浙江");

        ObservableList<String> strings1 = FXCollections.observableArrayList();
        strings1.add("浦东");
        strings1.add("长宁");
        strings1.add("奉贤");
        strings1.add("金山");

        ObservableList<String> strings2 = FXCollections.observableArrayList();
        strings2.add("嘉兴");
        strings2.add("金华");
        strings2.add("温州");

        cb.setItems(strings);


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(cb, cb2);

        AnchorPane.setTopAnchor(cb, 20d);
        AnchorPane.setTopAnchor(cb2, 20d);
        AnchorPane.setLeftAnchor(cb2, 200d);
        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        cb.show();

        cb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue.equals("上海")){
                cb2.setItems(strings1);
            }else{
                cb2.setItems(strings2);
            }
            cb2.show();
        });
    }
}
