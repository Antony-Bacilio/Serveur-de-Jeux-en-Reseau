package SERVEUR;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import MODELE.modelePenduImpl;
import MODELE.modeleTaquinImpl;


public class ServeurJeux {

	public static void main(String[] argv) {
		// TODO Auto-generated method stub

		try{
			int port = 7000;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:"+ port + "/Pendu", new modelePenduImpl());
			Naming.rebind("rmi://localhost:"+ port + "/Taquin", new modeleTaquinImpl());
			System.out.println("\n\tServer prêt pour commencer à Jouer!!!...");
			
		}
		catch(Exception ex){
			System.out.println("Server échec : " + ex);
		}
	}

}