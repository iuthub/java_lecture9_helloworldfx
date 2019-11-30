package com.desmonduz.helloworldfx3;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label lblGreeting;

    @FXML
    private TextField txtName;

    @FXML
    public void handleOK() {
        lblGreeting.setText("Hello, " + txtName.getText());
    }


}
