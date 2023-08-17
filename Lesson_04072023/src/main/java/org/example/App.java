package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/main.fxml")));
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Employee manager");
        primaryStage.show();
    }
}
