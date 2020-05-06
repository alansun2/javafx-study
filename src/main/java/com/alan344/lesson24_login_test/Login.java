package com.alan344.lesson24_login_test;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AlanSun
 * @date 2019/8/6 11:28
 */
public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private static Map<String, String> userInfo = new HashMap<>();

    static {
        userInfo.put("alan", "alan");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label nameLabel = new Label("账号：");
        Label pwdLabel = new Label("密码：");

        TextField nameField = new TextField();
        nameField.setTooltip(new Tooltip("请输入账号"));
        PasswordField passwordField = new PasswordField();

        Button login = new Button("登录");
        Button clear = new Button("清除");

//        nameField.setUserData("alan");

        GridPane gridPane = new GridPane();
        gridPane.getStyleClass().add("gridPane");

        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(pwdLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(clear, 0, 2);
        gridPane.add(login, 1, 2);

        gridPane.setHgap(5);
        gridPane.setVgap(17);

        GridPane.setMargin(login, new Insets(0, 0, 0, 100));

        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add("css/test24.css");

        primaryStage.setScene(scene);
        primaryStage.setTitle("登录");
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.setResizable(false);
        primaryStage.show();

        clear.setOnAction(event -> {
            nameField.setText("");
            passwordField.setText("");
        });

        login(login, nameField, passwordField, gridPane);
    }

    private void login(Button login, TextField nameField, PasswordField passwordField, GridPane gridPane) {
        login.setOnAction(event -> {
            String name = nameField.getText();
            String password = passwordField.getText();
            if (!userInfo.containsKey(name)) {
                System.out.println("用户不存在");
                FadeTransition fadeTransition = new FadeTransition();
                fadeTransition.setDuration(Duration.seconds(0.5));
                fadeTransition.setNode(gridPane);
                fadeTransition.setFromValue(0);
                fadeTransition.setToValue(1);
                fadeTransition.play();
            } else {
                String s = userInfo.get(name);
                if (password.equals(s)) {
                    System.out.println("登陆成功");
                    MyWindow myWindow = new MyWindow(name, password);
                } else {
                    System.out.println("密码错误");

                    FadeTransition fadeTransition = new FadeTransition();
                    fadeTransition.setDuration(Duration.seconds(0.5));
                    fadeTransition.setNode(gridPane);
                    fadeTransition.setFromValue(0);
                    fadeTransition.setToValue(1);
                    fadeTransition.play();
                }
            }
        });
    }
}
