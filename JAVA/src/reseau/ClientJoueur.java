package reseau;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import jeu.Joueur;

/**
 * Classe permettant de lier le joueur au client
 * @author salim
 *
 */

public class ClientJoueur {
	Socket socket;
	ObjectOutputStream os;
	ObjectInputStream is;
	Joueur joueur;
/**
 * 
 * @param oos : Objet � envoyer
 * @param ois : Objet re�u
 * @param s : La socket
 * @param j : Le joueur � laquelle le client est li�
 */
	public ClientJoueur(ObjectOutputStream oos, ObjectInputStream ois, Socket s, Joueur j) {
		os = oos;
		is = ois;
		socket = s;
		joueur = j;
	}

	public Socket getSocket() {
		return socket;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public ObjectOutputStream getOOS() throws IOException {
		return os;
	}

	public ObjectInputStream getOIS() {
		return is;
	}
}
