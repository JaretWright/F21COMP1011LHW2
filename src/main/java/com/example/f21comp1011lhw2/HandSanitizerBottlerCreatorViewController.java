package com.example.f21comp1011lhw2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HandSanitizerBottlerCreatorViewController implements Initializable {

    @FXML
    private TextField companyTextField;

    @FXML
    private TextField brandTextField;

    @FXML
    private Spinner<Integer> volumeSpinner;

    @FXML
    private Slider alcoholSlider;

    @FXML
    private Label sliderLabel;

    @FXML
    private CheckBox scentedCheckBox;

    @FXML
    private CheckBox pumpBottleCheckBox;

    @FXML
    private CheckBox refillableCheckBox;

    @FXML
    private Button submitButton;

    @FXML
    private void submitButtonPushed()
    {
        String company = companyTextField.getText();
        String brand = brandTextField.getText();

        System.out.printf("Company: %s, Brand: %s%n", company, brand);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        submitButton.setDisable(true);
    }
}