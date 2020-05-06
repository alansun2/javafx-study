package com.alan344.lesson_36_choic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 * @author AlanSun
 * @date 2019/8/6 14:18
 */
public class Main2 extends Application {
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
        ChoiceBox<Student> cb = new ChoiceBox<>();
        Student student1 = new Student("a", 11);
        Student student2 = new Student("b", 12);
        Student student3 = new Student("c", 13);
        cb.getItems().addAll(student1, student2, student3);
        cb.setPrefWidth(100);

        cb.setConverter(new StringConverter<Student>() {
            @Override
            public String toString(Student object) {

                return object.getName();
            }

            @Override
            public Student fromString(String string) {
                return null;
            }
        });


        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(cb);

        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        //图标
        primaryStage.getIcons().add(new Image("/image/icon.png"));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        cb.show();

        cb.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> System.out.println(newValue));
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
