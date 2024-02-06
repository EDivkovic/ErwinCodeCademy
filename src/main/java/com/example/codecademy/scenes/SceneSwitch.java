package com.example.codecademy.scenes;

import com.example.codecademy.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneSwitch {

    public SceneSwitch(Stage stage, String fxml) throws IOException {
        Parent nextParent = FXMLLoader.load(Objects.requireNonNull(App.class.getResource(fxml)));
        Scene nextScene = new Scene(nextParent);
        stage.setScene(nextScene);
    }
}