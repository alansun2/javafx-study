package com.alan344.lesson13_layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
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
        Button b1 = new Button("按钮1");
//        b1.setLayoutX(100);
//        b1.setLayoutY(100);
        Button b2 = new Button("按钮2");


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getStyleClass().add("anp");
        anchorPane.getChildren().addAll(b1, b2);

        anchorPane.setPadding(new Insets(10));

        AnchorPane.setTopAnchor(b1, 10d);
        AnchorPane.setLeftAnchor(b1, 10d);
        AnchorPane.setRightAnchor(b1, 10d);
//        AnchorPane.setBottomAnchor(b1, 10d);
        AnchorPane.setTopAnchor(b2, 100d);
        AnchorPane.setLeftAnchor(b2, 100d);


        Group group = new Group();
//        group.setStyle("-fx-background-color: #ffa433");
//        group.setOnMouseClicked(event -> System.out.println("sdfsd"));

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
