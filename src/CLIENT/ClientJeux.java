package CLIENT;

import java.net.URL;
import java.rmi.Naming;

import MODELE.modeleJeuxInterface;

//import java.rmi.Naming;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

public class ClientJeux extends Application{

	@Override
	public void start(final Stage primaryStage) throws Exception {
		// TODO Stub de la méthode généré automatiquement
		
		try {

		  	URL fxmlURL = getClass().getResource("/VUE/vueTaquin.fxml");
		  	FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
		  	Node root = fxmlLoader.load();
		  	Scene scene = new Scene((AnchorPane) root, 600, 400);
	   
		    primaryStage.setScene(scene);
		    primaryStage.setTitle("Jeu Taquin");
		    primaryStage.setResizable(false);
		    primaryStage.show();
		    
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] argv) {
		try{
			int port = 7000;
			modeleJeuxInterface objCal = (modeleJeuxInterface) Naming.lookup("rmi://localhost:" + port+ "/taquin");
			System.out.println("Client conected...");
			System.out.println("\n- La Somme  est : " + objCal.add(9, 20) );
			
			System.out.println("\n\t\t *********** Bienvenue à : Le Taquin *************");
			
		}
		catch(Exception ex){
			System.out.println("Client exception : " + ex);
		}
		
		launch(argv);
	}
	
	
}
