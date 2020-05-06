package com.alan344.lesson4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author AlanSun
 * @date 2019/8/5 12:33
 * <p>
 * 窗口类型
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage stage1 = new Stage();
        stage1.setTitle("s1");
//        stage1.initStyle(StageStyle.UTILITY);
        stage1.show();
        Stage stage2 = new Stage();
        stage2.setTitle("s2");
//        stage1.initStyle(StageStyle.TRANSPARENT);
        stage2.show();
        Stage stage3 = new Stage();
        stage3.setTitle("s3");
        stage3.show();
        Stage stage4 = new Stage();
        stage4.setTitle("s4");
        stage4.show();
        Stage stage5 = new Stage();
        stage5.setTitle("s5");
        stage5.show();

        Platform.exit();
    }
}
