package com.alan344.lesson_36_choic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
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
        ChoiceBox<String> cb = new ChoiceBox<>();
        cb.getItems().addAll("item1", "item2", "item3");
        cb.setPrefWidth(100);
        cb.setValue("item2");
        cb.getSelectionModel().select("item3");


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(cb);

        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        cb.show();

        cb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> System.out.println(newValue));
    }
}
