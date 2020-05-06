package com.alan344.lesson_82_listview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/9 17:52
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        ObservableList<String> objects = FXCollections.observableArrayList();
//        objects.add("data-a");
//        objects.add("data-b");
//        objects.add("data-c");
//        objects.add("data-d");
//        objects.add("data-e");
//        objects.add("data-f");
//        objects.add("data-g");
//        objects.add("data-h");
//
//        ListView<String> listView = new ListView<>(objects);

        ObservableList<AnchorPane> objects = FXCollections.observableArrayList();

        Label label = new Label("label1");
        AnchorPane.setTopAnchor(label, 50d);
        AnchorPane anchorPane1 = new AnchorPane(new Button("b1"),label );
        objects.add(anchorPane1);

        ListView<AnchorPane> listView = new ListView<>(objects);
        listView.setPrefHeight(300);
        listView.setPrefWidth(300);
        listView.setPlaceholder(new Label("没有数据"));

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(listView);

        AnchorPane.setTopAnchor(listView, 100d);
        AnchorPane.setLeftAnchor(listView, 100d);

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
