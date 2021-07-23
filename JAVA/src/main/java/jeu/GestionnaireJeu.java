package jeu;

import java.util.ArrayList;

public class GestionnaireJeu {
	Des lesdes;
	Lancer lancer;
	
	public GestionnaireJeu() {
		this.lesdes = new Des();
		this.lancer = new Lancer("non");
	}
	
	public void FaireUnLancer() {
		lancer.FaireLancer(lesdes);
	}
	
	public ArrayList<Integer> LesDes() {
		return lesdes.getDes();
	}
	
}
