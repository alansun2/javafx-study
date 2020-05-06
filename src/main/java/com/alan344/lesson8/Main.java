package com.alan344.lesson8;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

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
        Button b1 = new Button("b1");
        b1.setLayoutX(10);
        b1.setLayoutY(10);

        Button b2 = new Button("b2");
        b2.setLayoutX(100);
        b2.setLayoutY(10);

        Button b3 = new Button("b3");
        b3.setLayoutX(200);
        b3.setLayoutY(10);

        Group group = new Group();
        group.getChildren().addAll(b1, b2, b3);

        //检测组件是否存在（注意：只检测组件左上角的点）
        System.out.println(group.contains(0, 0));

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
