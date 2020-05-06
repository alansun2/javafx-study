package com.alan344.lesson_90_dialog;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Optional;

/**
 * @author AlanSun
 * @date 2019/8/8 15:40
 */
public class Main extends Application {

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

            Dialog<ButtonType> dialog = new Dialog<>();

            dialog.setTitle("新年快乐");

            dialog.setContentText("error");

//            dialog.setWidth(1000);

            dialog.getDialogPane().getButtonTypes().add(ButtonType.APPLY);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);

            dialog.getDialogPane().setPrefSize(200, 300);

//            Button button1 = (Button) dialog.getDialogPane().lookupButton(ButtonType.CLOSE);
//            button1.setOnAction(event1 -> {
//                System.out.println("close");
//            });

            Optional<ButtonType> s = dialog.showAndWait();
            s.ifPresent(s1 -> {
                if(s1.equals(ButtonType.APPLY)){
                    System.out.println("apply");
                }else if(s1.equals(ButtonType.CLOSE)){
                    System.out.println("close1");
                }
            });
//            dialog.show();
        });
    }

}
