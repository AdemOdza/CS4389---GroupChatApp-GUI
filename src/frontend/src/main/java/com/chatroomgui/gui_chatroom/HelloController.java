package com.chatroomgui.gui_chatroom;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML private Label welcomeText;
    @FXML private TextField passwordTextField;
    @FXML private TextField usernameTextField;
    
    @FXML
    protected void onHelloButtonClick() 
    {
        String password = passwordTextField.getText();
        String username = usernameTextField.getText();
        if(!username.equals("username") || !password.equals("password"))
        {
            welcomeText.setText("Incorrect username and/or password");
        }
        else
        {
            welcomeText.setText("You're good to go");
        }
    }
}