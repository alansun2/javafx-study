package com.alan344.lesson3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/5 12:33
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));


//        primaryStage.setIconified(true); //设置最小化

//        primaryStage.setMaximized(true); //设置最大化

        primaryStage.setWidth(500);
        primaryStage.setHeight(500);

//        primaryStage.setResizable(false); //设置窗口无法改变大小

        //最大最小宽高
//        primaryStage.setMaxWidth(800);
//        primaryStage.setMaxHeight(800);
//
//        primaryStage.setMinWidth(300);
//        primaryStage.setMinHeight(300);

        //透明度
//        primaryStage.setOpacity(0.5);

        primaryStage.show();

        //设置全屏
        primaryStage.setFullScreen(true);//设置全屏
        primaryStage.setScene(new Scene(new Group()));

        //高度监听
//        primaryStage.heightProperty().addListener((observable, oldValue, newValue) -> System.out.println(newValue.doubleValue()));

        //宽度监听
//        primaryStage.widthProperty().addListener((observable, oldValue, newValue) -> System.out.println(newValue.doubleValue()));

        //如果未设置宽高，要在show方法后面获取
//        System.out.println("宽度：" + primaryStage.getWidth() + "\n" + "高度：" + primaryStage.getHeight());
//        primaryStage.close(); //关闭窗口
    }
}
