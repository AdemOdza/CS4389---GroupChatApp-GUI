package com.chatroomgui.gui_chatroom;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ChatGUIController {

    public static Scene getChatroom() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginApplication.class.getResource("chat-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        return scene;
    }

    @FXML
    public void onSendButtonClick() {

    }

    @FXML
    public void onUserMenuItemSelect() {

    }

    @FXML
    public void updateUserMenu() {

    }

    @FXML
    public void updateMessageScreen(String origin) {

    }


}
