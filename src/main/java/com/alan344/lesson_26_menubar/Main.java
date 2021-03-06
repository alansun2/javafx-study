package com.alan344.lesson_26_menubar;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    /**
     * MenuBar Menu MenuButton radioMenuItem CheckMenuItem SeparatorMenuItem SplitMenuButton CustomMenuItem
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane = new AnchorPane();
        MenuBar menuBar = new MenuBar();

        Menu menu1 = new Menu("menu1");
        Menu menu2 = new Menu("menu2");
        Menu menu3 = new Menu("menu3");
        Menu menu4 = new Menu("menu4");

        MenuItem menuItem1 = new MenuItem("menuItem1", new ImageView("image/icon.png"));
        //快捷键
        menuItem1.setAccelerator(KeyCombination.valueOf("shift+D"));
        MenuItem menuItem2 = new MenuItem("menuItem2");
        MenuItem menuItem3 = new MenuItem("menuItem3");
        MenuItem menuItem4 = new MenuItem("menuItem4");
        MenuItem menuItem5 = new MenuItem("menuItem5");

        menu1.getItems().addAll(menuItem1, menuItem2, menuItem3);
        menu3.getItems().addAll(menuItem4, menuItem5);

        anchorPane.getChildren().add(menuBar);

        menuBar.getMenus().addAll(menu1, menu2, menu3, menu4);

        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        menuBar.setPrefWidth(primaryStage.getWidth());
        anchorPane.widthProperty().addListener((observable, oldValue, newValue) -> {
            menuBar.setPrefWidth(newValue.doubleValue());
        });

        menuItem1.setOnAction(event -> System.out.println("menuItem1"));
        menuItem2.setOnAction(event -> System.out.println("menuItem2"));
        menuItem3.setOnAction(event -> System.out.println("menuItem3"));
        menuItem4.setOnAction(event -> System.out.println("menuItem4"));
        menuItem5.setOnAction(event -> System.out.println("menuItem5"));

        menu1.setOnShowing(event -> System.out.println("menu1 showing"));
    }
}
