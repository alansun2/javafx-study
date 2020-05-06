package com.alan344.TestTree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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
        TreeItem<String> root, bucky, megan;

        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        //Bucky
        bucky = makeBranch("Bucky", root);
//        bucky.expandedProperty().addListener((observable, oldValue, newValue) -> {
//            System.out.println("aaa");
//        });

        //展开监听
//        bucky.addEventHandler(TreeItem.branchExpandedEvent(), event -> {
//            System.out.println("aaa");
//        });
        //收缩监听
//        bucky.addEventHandler(TreeItem.branchCollapsedEvent(), event -> {
//            System.out.println("aaa");
//        });

//        bucky.addEventHandler(TreeItem.treeNotificationEvent(), event -> {
//            System.out.println("aaa");
//        });
        makeBranch("thenewboston", bucky);
        makeBranch("YouTube", bucky);
        makeBranch("Chicken", bucky);

        //Bucky
        megan = makeBranch("Megan", root);
        makeBranch("Glitter", megan);
        makeBranch("Makeup", megan);


        //Create tree
        TreeView<String> tree = new TreeView<>(root);
        tree.setShowRoot(false);

        MenuItem del = new MenuItem("delete");
        ContextMenu contextMenu = new ContextMenu(del);
        del.setOnAction(event -> {
            TreeItem<String> selectedItem = tree.getSelectionModel().getSelectedItem();
            root.getChildren().remove(selectedItem);
        });
        tree.setContextMenu(contextMenu);

        root.addEventHandler(TreeItem.childrenModificationEvent(), event -> System.out.println("childrenModificationEvent"));
        root.addEventHandler(TreeItem.expandedItemCountChangeEvent(), event -> System.out.println("expandedItemCountChangeEvent"));

        tree.expandedItemCountProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("gg");
        });

        StackPane anchorPane = new StackPane();

        anchorPane.getChildren().add(tree);
        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }
}
