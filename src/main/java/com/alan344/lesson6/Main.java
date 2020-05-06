package com.alan344.lesson6;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/5 13:43
 * <p>
 * 获取屏幕信息
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<Screen> screens = Screen.getScreens();
        screens.forEach(screen -> System.out.println(screen.getDpi()));

        Screen primary = Screen.getPrimary();

        Rectangle2D bounds = primary.getBounds();

        //获取可是
        Rectangle2D visualBounds = primary.getVisualBounds();

        System.out.println("dpi = " + primary.getDpi());

        //获取全部的屏幕宽高和坐标
        System.out.println("全部的屏幕宽高和坐标");
        System.out.println("左上角x：" + bounds.getMinX() + "  " + "左上角y：" + bounds.getMinY());
        System.out.println("右下角x：" + bounds.getMaxX() + "  " + "右下角y：" + bounds.getMaxY());

        System.out.println("宽度：" + bounds.getWidth() + "  " + "高度：" + bounds.getHeight());

        //获取可视的屏幕宽高和坐标

        System.out.println("可视的屏幕宽高和坐标");
        System.out.println("左上角x：" + visualBounds.getMinX() + "  " + "左上角y：" + visualBounds.getMinY());
        System.out.println("右下角x：" + visualBounds.getMaxX() + "  " + "右下角y：" + visualBounds.getMaxY());

        System.out.println("宽度：" + visualBounds.getWidth() + "  " + "高度：" + visualBounds.getHeight());

        Platform.exit();
    }
}
