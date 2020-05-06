package com.alan344.lesson_92_dialog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author AlanSun
 * @date 2019/8/8 15:40
 */
public class Main3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("b1");


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(button);

        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        button.setOnAction(event -> {

            AnchorPane anchorPane1 = new AnchorPane();

            Button button1 = new Button("b1");
            anchorPane1.getChildren().add(button1);

            Stage stage = new Stage();

            stage.initOwner(primaryStage);
            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initStyle(StageStyle.UTILITY);

            stage.setAlwaysOnTop(true);
            stage.setScene(new Scene(anchorPane1));
            stage.setWidth(300);
            stage.setHeight(300);
            stage.show();

        });
    }

}
