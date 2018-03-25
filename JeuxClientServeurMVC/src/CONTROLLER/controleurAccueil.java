package CONTROLLER;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class controleurAccueil {

	@FXML
    private Label lblTitle;

    @FXML
    private Label lblBienvenue;

    @FXML
    private Button btnPendu;

    @FXML
    private Button btnTaquin;

    @FXML
    private Button btnTictactoc;

    @FXML
    void btnPendu(ActionEvent event) {
    	
    	Stage menu = (Stage) btnTictactoc.getScene().getWindow();
        menu.close();
        try {
              AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../VUE/vueTaquin.fxml"));
              Scene scene = new Scene(root,600,400); 
              Stage stage = new Stage();
	            stage.setTitle("Taquin");       
	            stage.setScene(scene);		
	            stage.setResizable(false);
	            stage.show();
          } catch(Exception e) {
              e.printStackTrace();
          }
    }

    @FXML
    void btnTaquin(ActionEvent event) {
    	Stage menu = (Stage) btnTictactoc.getScene().getWindow();
        menu.close();
        try {
              AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../VUE/vuePendu.fxml"));
              Scene scene = new Scene(root,600,400); 
              Stage stage = new Stage();
	            stage.setTitle("Taquin");       
	            stage.setScene(scene);		
	            stage.setResizable(false);
	            stage.show();
          } catch(Exception e) {
              e.printStackTrace();
          }

    }

    @FXML
    void btnTictactoc(ActionEvent event) {

    }

}