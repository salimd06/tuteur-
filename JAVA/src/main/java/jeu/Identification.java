package jeu;

import java.net.SocketAddress;

public class Identification {

	private String nom;
	private boolean tour; //0 peut pas jouer et 1 peut joeur
	
	public Identification() {}
	
	public Identification(String nom) {
		this.nom = nom;
		this.tour = false;
	}
	
	public String getNom() {return nom;}

	public void setNom(String nom) {this.nom = nom;}
	
	public boolean getTour() {return tour;}
	
	public void setTour(boolean tour) {this.tour = tour;}
	
}
