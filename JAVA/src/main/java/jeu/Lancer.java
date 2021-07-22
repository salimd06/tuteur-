package jeu;

import java.util.ArrayList;

public class Lancer {
	
	private String statut; 
	
	public Lancer() {
		
	}
	
	public Lancer(String statut) {
		this.statut = statut;
	}
	
	public void FaireLancer(Des lesdes) {
		int de1 = (int) (Math.random() * ( 6 - 1 ));
		int de2 = (int) (Math.random() * ( 6 - 1 ));
		int de3 = (int) (Math.random() * ( 6 - 1 ));
		int de4 = (int) (Math.random() * ( 6 - 1 ));
		lesdes.setDe(de1, de2, de3, de4);
	}
	
	public String getStatut() {
		return statut;
	}

	//Math.random() * ( Max - Min )
	
}
