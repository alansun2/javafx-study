package com.alan344.lesson7;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;

/**
 * @author AlanSun
 * @date 2019/8/5 13:58
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //打开网页
        HostServices hostServices = getHostServices();
        hostServices.showDocument("www.baidu.com");

        Button button = new Button("按钮");
        button.setPrefWidth(50);
        button.setPrefHeight(50);

        Group group = new Group();
        group.getChildren().add(button);

        Scene scene = new Scene(group);
//        scene.setCursor(Cursor.MOVE);

        URL resource = getClass().getClassLoader().getResource("image/icon.png");

        scene.setCursor(Cursor.cursor(resource.toExternalForm()));


        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
