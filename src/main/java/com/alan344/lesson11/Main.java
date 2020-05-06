package com.alan344.lesson11;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/5 13:58
 * <p>
 * 快捷键
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("按钮");
        b1.getStyleClass().add("button");

        b1.setOnAction(event -> System.out.println("b1"));


        Group group = new Group();
        group.getChildren().addAll(b1);

        Scene scene = new Scene(group);
        scene.getStylesheets().add("/css/test.css");

        KeyCombination keyCombination = new KeyCodeCombination(KeyCode.C, KeyCombination.SHIFT_ANY);
        scene.getAccelerators().put(keyCombination, b1::fire);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
