package com.alan344.lesson_30_tabpan;

import javafx.application.Application;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

        TabPane tabPane = new TabPane();
        tabPane.setPrefWidth(300);
        tabPane.setPrefHeight(300);
        tabPane.setStyle("-fx-background-color: #ffd195");
        Tab tab1 = new Tab("tab1");
        tab1.setClosable(false);
        Tab tab2 = new Tab("tab2");
        Tab tab3 = new Tab("tab3");

        tabPane.setSide(Side.RIGHT);
        tabPane.getTabs().addAll(tab1, tab2, tab3);

        tabPane.setRotateGraphic(false);

        anchorPane.getChildren().addAll(tabPane);

        AnchorPane.setTopAnchor(tabPane, 100d);
        AnchorPane.setLeftAnchor(tabPane, 100d);
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
