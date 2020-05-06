package com.alan344.lesson24_login_test;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * @author AlanSun
 * @date 2019/8/6 17:09
 */
public class Controller {

    @FXML
    private TextField name;
    @FXML
    private PasswordField password;

    public void login(){
        System.out.println("name = " + name.getText() + " pwd = " + password.getText());
    }
}
