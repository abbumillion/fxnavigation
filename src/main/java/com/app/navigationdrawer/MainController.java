package com.app.navigationdrawer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    public BorderPane root;
    @FXML
    public Button home;
    @FXML
    public Button dashboard;
    @FXML
    public Button albums;
    @FXML
    public Button images;
    @FXML
    public Button settings;
    @FXML
    public Button library;
    @FXML
    public ListView<String> listview;
    @FXML
    public Label title;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
@FXML
    public void setHome(ActionEvent actionEvent) {
        title.setText("Home");
        switchCenter("home-view.fxml");
    }
    @FXML
    public void setSettings(ActionEvent actionEvent) {
        title.setText("Settings");
        switchCenter("settings.fxml");
    }
    @FXML
    public void setDashboard(ActionEvent actionEvent) {
        title.setText("Dashboard");
        switchCenter("dashboard-view.fxml");
    }
//    @FXML
//    public void setImages(ActionEvent actionEvent) {
//        title.setText("Images");
//        switchCenter("home-view.fxml");
//    }
//    @FXML
//    public void setLibrary(ActionEvent actionEvent) {
//        title.setText("Home");
//        switchCenter("home-view.fxml");
//    }
//    @FXML
//    public void setAlbums(ActionEvent actionEvent) {
//        title.setText("Home");
//        switchCenter("home-view.fxml");
//    }
    private void switchCenter(String source)  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(source));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 320, 240);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        root.setCenter(scene.getRoot());
    }
}
