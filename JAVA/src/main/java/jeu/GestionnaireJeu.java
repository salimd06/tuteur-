package jeu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.corundumstudio.socketio.SocketIOClient;

public class GestionnaireJeu {
	private Des lesdes;
	private Lancer lancer;
	public int joueurCourant;
	
	public Map<Integer,SocketIOClient> joueurs;
	private boolean Etat;
	
	public GestionnaireJeu() {
		this.lesdes = new Des();
		this.lancer = new Lancer("non");
		//this.Joueurs = new ArrayList<Identification>();
		joueurs = new HashMap<Integer, SocketIOClient>();
		this.Etat = false;
		joueurCourant = 1;
	}
	
	public boolean FaireUnLancer(Identification LeClient) {
		/*if(this.nombreJoueur()==4) {
			System.out.println(LeClient.getTour());
			Joueurs.get(0).setTour(true);
			this.Etat = true;
		if(LeClient.getTour()) {
			
			
			return this.Etat;
		}
		
		}
		*/
		lancer.FaireLancer(lesdes);
		return this.Etat;
	}
	
	public ArrayList<Integer> LesDes() {
		lancer.FaireLancer(lesdes);
		return lesdes.getDes();
	}
	
	/*public void AjouterJoueur(Identification joueur) {
		if(Joueurs.size()<4) {
			Joueurs.add(joueur);
		}else {
			System.out.println("Il y'a déjà 4 joueurs de connecté ");
		}
	}
	
	public int nombreJoueur() {
		return this.Joueurs.size();
	}
	
	public ArrayList<Identification> getJoueurs(){
		return Joueurs;
	}
	
	public void setJoueurs(ArrayList<Identification> j) {
		this.Joueurs = j;
	}*/
	
	public void PasserTour() {
		if(joueurCourant == 2) {
			joueurCourant = 1;
			lancer.FaireLancer(lesdes);
		}else
			joueurCourant++;
	}
	
	public void setEtat(boolean etat) {
		this.Etat = etat;
	}
	
	public boolean getEtat() {
		return this.Etat;
	}

	public Object getjoueurCourant() {
		// TODO Auto-generated method stub
		return joueurCourant;
	}
	
	
}
