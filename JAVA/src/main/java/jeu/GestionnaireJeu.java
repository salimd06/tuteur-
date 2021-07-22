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
		int de1 = (int) (Math.random() * ( 6 - 1 ));
		int de2 = (int) (Math.random() * ( 6 - 1 ));
		int de3 = (int) (Math.random() * ( 6 - 1 ));
		int de4 = (int) (Math.random() * ( 6 - 1 ));
		lesdes.setDe(de1, de2, de3, de4);
	}
	
	public ArrayList<Integer> LesDes() {
		return lesdes.getDes();
	}
	
}
