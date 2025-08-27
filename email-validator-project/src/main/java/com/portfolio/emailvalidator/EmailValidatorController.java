package com.portfolio.emailvalidator;

import com.portfolio.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EmailValidatorController {

    @FXML
    private TextField emailInput;
    @FXML
    private Label validationResult;

    @FXML
    private void validateEmail() {
        String email = emailInput.getText();
        if (EmailValidator.isValid(email)) {
            validationResult.setText("E-mail válido!");
            validationResult.setStyle("-fx-text-fill: green;");
        } else {
            validationResult.setText("E-mail inválido!");
            validationResult.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    private void goBack() throws IOException {
        App.setRoot("primary");
    }
}

