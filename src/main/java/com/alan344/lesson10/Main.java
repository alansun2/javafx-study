package com.alan344.lesson10;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
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
        Button b1 = new Button("按钮");
        b1.setLayoutX(10);
        b1.setLayoutY(10);

        //css
        b1.setStyle("-fx-background-color: #5eff7e;");
        b1.setOnAction(event -> {
            Button source = (Button) event.getSource();
            source.setTextFill(Paint.valueOf("blue"));
        });

        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            MouseButton button = event.getButton();
            if (event.getClickCount() == 2 && button == MouseButton.PRIMARY) {
                System.out.println("双击事件");
            }
        });

        b1.setOnKeyPressed(event -> {
            KeyCode code = event.getCode();
            if(code.equals(KeyCode.ENTER)){
                System.out.println("enter");
            }
        });

        Group group = new Group();
        group.getChildren().addAll(b1);

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
