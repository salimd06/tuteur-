package reseau;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


/**
 * Serveur du jeu
 * 
 * @author salim
 *
 */
public class Serveur {

	/**
	 * 
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InterruptedException
	 */

	public static void main (String[] args) throws IOException, ClassNotFoundException, InterruptedException {
	
		ServerSocket ss = new ServerSocket(1026);
		System.out.println("En attente de connexion d'un client");
		Socket s = ss.accept();
		System.out.println("Connexion établie");
		
		//Récupération des donnée envoyée par le client
		DataInputStream in = new DataInputStream(s.getInputStream());
		String nomClient = in.readUTF();
		
		//Traitement
		String s1 = "Bien enregistré "+nomClient+", la connexion c'est bien déroulé";
		
		//Envoi de la donnée au client
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeUTF(s1);
		
		ss.close();
	}
	
}
