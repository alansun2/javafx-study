package com.alan344.lesson15_layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/5 13:58
 * <p>
 * 输入框，密码框，标签
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button b1 = new Button("button1");
        Button b2 = new Button("button2");
        Button b3 = new Button("button3");
        //水平
        HBox hBox = new HBox();
        hBox.getStyleClass().add("hbox");
//        hBox.setPrefHeight(400);
//        hBox.setPrefWidth(400);
        hBox.setPadding(new Insets(10));
        hBox.setSpacing(10);
//        HBox.setMargin(b1, new Insets(10));
        hBox.setAlignment(Pos.BASELINE_CENTER);

        hBox.getChildren().addAll(b1, b2, b3);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getStyleClass().add("anp");
        anchorPane.getChildren().addAll(hBox);
        AnchorPane.setLeftAnchor(hBox, 10d);
        AnchorPane.setRightAnchor(hBox, 10d);

        Scene scene = new Scene(anchorPane);
        scene.getStylesheets().add("/css/test13.css");

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
