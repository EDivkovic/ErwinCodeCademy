package com.example.codecademy.controllers;

import com.example.codecademy.scenes.SceneSwitch;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private AnchorPane home_anchorpane;

    @FXML
    private Tab home_certificatestab;

    @FXML
    private Tab home_coursestab;

    @FXML
    private Tab home_hometab;

    @FXML
    private ImageView home_imageview;

    @FXML
    private Tab home_registrationstab;

    @FXML
    private Tab home_studentstab;
    @FXML
    void addPersonButton(ActionEvent event) throws IOException {
        Stage stage = (Stage) home_anchorpane.getScene().getWindow();
        new SceneSwitch(stage, "student.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}