package SERVEUR;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import CONTROLLER.taquinImpl;

public class serveurProjet {

	public static void main(String[] argv) {
		// TODO Auto-generated method stub

		try{
			int port = 7000;
			LocateRegistry.createRegistry(port);
			Naming.rebind("rmi://localhost:"+ port + "/taquin", new taquinImpl());
			System.out.println("Server prêt pour commencer à Jouer!!!...");
			
		}
		catch(Exception ex){
			System.out.println("Server échec : " + ex);
		}
	}

}
