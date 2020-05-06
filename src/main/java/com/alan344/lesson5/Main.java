package com.alan344.lesson5;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/5 13:30
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Platform.runLater(() -> {
            System.out.println("run 方法里面的线程名字：" + Thread.currentThread().getName());
            int size = 10;
            for (int i = 0; i < size; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i = " + i);
            }
        });

        System.out.println("runLater下面");
    }
}
