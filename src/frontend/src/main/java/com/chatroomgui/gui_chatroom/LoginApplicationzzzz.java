package com.chatroomgui.gui_chatroom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class LoginApplicationzzzz extends Application
{
    @Override
    public void start(Stage stage) throws IOException 
    {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplicationzzzz.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setAlwaysOnTop(true);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
        
    }
}