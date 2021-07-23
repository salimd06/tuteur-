package jeu;

import java.util.ArrayList;
import java.util.Random;

public class Lancer {
	
	private String statut; 
	private Random random;
	
	public Lancer() {
		random = new Random();
	}
	
	public Lancer(String statut) {
		this.statut = statut;
		this.random = new Random();

	}
	
	public void FaireLancer(Des lesdes) {
		
		int de1 = random.nextInt(7);
		int de2 = random.nextInt(7);
		int de3 = random.nextInt(7);
		int de4 = random.nextInt(7);
		lesdes.setDe(de1, de2, de3, de4);
	}
	
	public String getStatut() {
		return statut;
	}

	//Math.random() * ( Max - Min )
	
}
