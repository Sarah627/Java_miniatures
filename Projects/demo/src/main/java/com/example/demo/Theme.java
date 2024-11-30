package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Authentication {
    @FXML
    private TextField PasswordTxt;
    @FXML
    private TextField emailTxt;
    @FXML
    private Button accessBtn;
    @FXML
    private Label emailValLbl;
    @FXML
    private Label passValLabl;
    @FXML
    private Label authLabel;
    @FXML
    private CheckBox darkModeChecker;
    @FXML
    private AnchorPane backgroundPane;

    private Scene scene;
    private Stage stage;
    private Parent root;
    private FXMLLoader loader;
    private MainSceneController maincontroller;
    private String email, password,response;

    @FXML
    public void initialize() {
        accessBtn.setStyle("-fx-background-color: #45cde6; -fx-text-fill: white; -fx-font-size: 14px; -fx-background-radius: 15; -fx-border-radius: 50;");
        emailTxt.setStyle("-fx-border-width: 0 0 2px 0;" +
                "-fx-border-color: transparent transparent #828583 transparent;");
        PasswordTxt.setStyle("-fx-border-width: 0 0 2px 0;" +
                "-fx-border-color: transparent transparent #828583 transparent;");
    }

    // scene
    private void switchScene(ActionEvent event) throws IOException {
        loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        root = loader.load();
        maincontroller = loader.getController();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDarkMode(){
        if (darkModeChecker.isSelected()){
            backgroundPane.setStyle("-fx-background-color: #272829");
            authLabel.setStyle("-fx-text-fill: #fff");
            darkModeChecker.setStyle("-fx-text-fill: #fff");
        }
        else{
            backgroundPane.setStyle(null);
            authLabel.setStyle(null);
            darkModeChecker.setStyle(null);
        }
    }

    public abstract void access(ActionEvent event) throws IOException;

}
