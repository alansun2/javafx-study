package com.alan344.lesson12_text_label;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
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

        TextField text = new TextField();
        text.getStyleClass().add("text");
//        text.setText("这时文本");

        text.setLayoutX(100);
        text.setLayoutY(100);

        //提示
        text.setTooltip(new Tooltip("请输入名字"));

        //placeholder
        text.setPromptText("请输入名字");

        //失去焦点
        text.setFocusTraversable(false);

        //限制文本长度
        text.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > 7) {
                text.setText(oldValue);
            }
        });

        text.selectedTextProperty().addListener((observable, oldValue, newValue) -> System.out.println(newValue));

        //文本框鼠标点击
        text.setOnMouseClicked(event -> System.out.println("text 单击"));

        PasswordField passwordField = new PasswordField();
        passwordField.getStyleClass().add("text");
//        text.setText("这时文本");

        passwordField.setLayoutX(100);
        passwordField.setLayoutY(300);
        passwordField.setPromptText("最长8位");
        passwordField.setFocusTraversable(false);


        //label
        Label label = new Label("密码：");
        label.setLayoutX(10);
        label.setLayoutY(300);

        Label label2 = new Label("名字：");
        label2.setLayoutX(10);
        label2.setLayoutY(100);


        Group group = new Group();
        group.getChildren().addAll(text, passwordField, label, label2);

        Scene scene = new Scene(group);
        scene.getStylesheets().add("/css/test.css");

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
