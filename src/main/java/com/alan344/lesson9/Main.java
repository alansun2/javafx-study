package com.alan344.lesson9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
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
        b1.setFont(Font.font("sans-serif", 40));
//        b1.setBackground(new Background(new BackgroundFill(Paint.valueOf("#8FBC8F"), new CornerRadii(20), new Insets(10))));

//        b1.setBorder(new Border(new BorderStroke(Paint.valueOf("#8A2BE2"), BorderStrokeStyle.DASHED, new CornerRadii(20), new BorderWidths(5))));

        b1.setTextFill(Paint.valueOf("#CD0000"));

        //css
        b1.setStyle("-fx-background-color: #5eff7e;");
        b1.setCursor(Cursor.HAND);
        b1.setOnAction(event -> {
            Button source = (Button) event.getSource();
            source.setTextFill(Paint.valueOf("blue"));
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
