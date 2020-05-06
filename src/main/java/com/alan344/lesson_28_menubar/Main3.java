package com.alan344.lesson_28_menubar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * MenuBar Menu MenuButton radioMenuItem CheckMenuItem SeparatorMenuItem SplitMenuButton CustomMenuItem
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();

        Button button = new Button("button");
        ContextMenu contextMenu = new ContextMenu();
        MenuItem menuItem1 = new MenuItem("menuItem1");
        MenuItem menuItem2 = new MenuItem("menuItem2");
        MenuItem menuItem3 = new MenuItem("menuItem3");
        contextMenu.getItems().addAll(menuItem1, menuItem2, menuItem3);

        button.setContextMenu(contextMenu);
        anchorPane.getChildren().add(button);

        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        //监听右键
        button.setOnContextMenuRequested(event -> {

        });
    }
}
