package com.chatroomgui.gui_chatroom;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class GUIResources {

    public static void setLoginScene(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUIResources.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setAlwaysOnTop(true);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void setChatRoomScene(Stage stage) throws IOException{
        stage.hide();
        FXMLLoader fxmlLoader = new FXMLLoader(GUIResources.class.getResource("chat-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setAlwaysOnTop(true);
        stage.setTitle("Chat Room");
        stage.setScene(scene);
        stage.show();
    }

}