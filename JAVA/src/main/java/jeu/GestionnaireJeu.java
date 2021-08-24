package jeu;

import java.util.ArrayList;

public class GestionnaireJeu {
	Des lesdes;
	Lancer lancer;
	ArrayList<Identification> Joueurs;
	boolean Etat;
	
	public GestionnaireJeu() {
		this.lesdes = new Des();
		this.lancer = new Lancer("non");
		this.Joueurs = new ArrayList<Identification>();
		this.Etat = false;
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
		return lesdes.getDes();
	}
	
	public void AjouterJoueur(Identification joueur) {
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
	}
	
	public void setEtat(boolean etat) {
		this.Etat = etat;
	}
	
	public boolean getEtat() {
		return this.Etat;
	}
	
	
}
