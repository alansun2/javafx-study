package com.alan344.lesson_91_alter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/8 15:40
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("b1");


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(button);

        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        button.setOnAction(event -> {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("错误");
            alert.showAndWait().ifPresent(System.out::println);
        });
    }

}
