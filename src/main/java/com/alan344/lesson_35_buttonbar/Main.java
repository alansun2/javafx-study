package com.alan344.lesson_35_buttonbar;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * TitledPane
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {

        ButtonBar buttonBar = new ButtonBar();
        Button b1 = new Button("b1");
        b1.setPrefWidth(200);
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");

        ButtonBar.setButtonData(b1, ButtonBar.ButtonData.APPLY);
        ButtonBar.setButtonData(b2, ButtonBar.ButtonData.FINISH);
        ButtonBar.setButtonData(b3, ButtonBar.ButtonData.NO);

        buttonBar.getButtons().addAll(b1, b2, b3);

        buttonBar.setButtonOrder(ButtonBar.BUTTON_ORDER_MAC_OS);

        ButtonBar.setButtonUniformSize(b1, true);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(buttonBar);

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
