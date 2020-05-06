package com.alan344.lesson_29_accordion_titledpane;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * TitledPane
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();

        Accordion accordion = new Accordion();
        //不要设置宽高
        TitledPane titledPane = new TitledPane("titledPane1", new Button("b1"));
        TitledPane titledPane2 = new TitledPane("titledPane2", new Button("b2"));
        titledPane2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        accordion.getPanes().addAll(titledPane, titledPane2);

        anchorPane.getChildren().addAll(accordion);
        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }
}
