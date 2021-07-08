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
		System.out.println("Connexion �tablie");
		
		//R�cup�ration des donn�e envoy�e par le client
		DataInputStream in = new DataInputStream(s.getInputStream());
		String nomClient = in.readUTF();
		
		//Traitement
		String s1 = "Bien enregistr� "+nomClient+", la connexion c'est bien d�roul�";
		
		//Envoi de la donn�e au client
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeUTF(s1);
		
		ss.close();
	}
	
}
