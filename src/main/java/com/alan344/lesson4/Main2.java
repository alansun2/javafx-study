package com.alan344.lesson4;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/5 13:22
 * <p>
 * 模态窗口
 */
public class Main2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        stage.show();

        Stage stage2 = new Stage();
        stage2.initModality(Modality.APPLICATION_MODAL);
        stage2.show();
    }
}
