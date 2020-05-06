package com.alan344.lesson24_login_test;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 13:56
 */
public class MyWindow {

    public MyWindow(String name, String pwd) {
        Text text = new Text("账号：" + name + " 密码：" + pwd);


        BorderPane bor = new BorderPane();
        bor.setStyle("-fx-background-color: #ffd6d5");
        bor.setCenter(text);

        Scene scene = new Scene(bor);

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("登录成功");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}
