package reseau;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import jeu.GestionnaireJeu;
import jeu.Identification;



/**
 * Serveur du jeu
 * 
 * @author salim
 *
 */
public class Serveur {
	
	Identification leClient;
	
	static ConnexionServeur connexion;
	
	
	
	public ConnexionServeur getConnexion() {return connexion;}
	
	public void setConnexion(ConnexionServeur connexion) {this.connexion = connexion;}
	
	public Serveur() {
		
	}
	
	public void demarrer() {
		connexion.demarrer();
	}
	
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws InterruptedException
	 */

	public static final void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
	
		Serveur serveur = new Serveur();
		GestionnaireJeu gestionnaire = new GestionnaireJeu();
		
		ConnexionServeur connexion = new ConnexionServeur("127.0.0.1",10112);
		
		

		serveur.setConnexion(connexion);
		
		serveur.demarrer();
		
		
		
		System.out.println("couc");
		
		
	}
	
	
	
	
}
