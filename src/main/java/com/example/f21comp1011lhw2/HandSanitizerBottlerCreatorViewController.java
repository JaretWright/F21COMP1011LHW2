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
    private Label createdObjectLabel;

    @FXML
    private void submitButtonPushed()
    {
        String company = companyTextField.getText();
        String brand = brandTextField.getText();
        boolean refillable = refillableCheckBox.isSelected();
        boolean pumpBottle = pumpBottleCheckBox.isSelected();
        boolean scented = scentedCheckBox.isSelected();
        float alcohol = 40;
        int volumeOfBottle = 500;

        try{
            HandSanitizerBottle hsb = new HandSanitizerBottle(company,brand,scented,volumeOfBottle,alcohol,pumpBottle,refillable);

            createdObjectLabel.setText(hsb.toString());
        } catch (Exception e)
        {
            createdObjectLabel.setText(e.getMessage());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        submitButton.setDisable(true);
        createdObjectLabel.setText("");
    }
}