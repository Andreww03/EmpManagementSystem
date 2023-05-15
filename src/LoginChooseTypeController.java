/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ANDREW
 */
public class LoginChooseTypeController implements Initializable {

    @FXML
    private Button admin_button;

    @FXML
    private Button emp_button;

    @FXML
    private Button manager_button;

    private double x = 0;
    private double y = 0;
    
    public void chooseType() {
        
        admin_button.setOnAction(event -> {
            try {
                // Load the FXML file for admin form
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginForm.fxml"));
                Parent root = loader.load();

                // Set the loaded view as the content of the current scene
                Scene scene = new Scene(root);
                Stage stage = (Stage) admin_button.getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        manager_button.setOnAction(event -> {
            try {
                // Load the FXML file for manager form
                FXMLLoader loader = new FXMLLoader(getClass().getResource("managerForm.fxml"));
                Parent root = loader.load();

                // Set the loaded view as the content of the current scene
                Scene scene = new Scene(root);
                Stage stage = (Stage) manager_button.getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    
    public void close() {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
