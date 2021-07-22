package jeu;

public class Identification {

	private String nom;
	private int niveau;
	
	public Identification() {}
	
	public Identification(String nom,int niveau) {
		this.nom = nom;
		this.niveau = niveau;
	}
	
	public String getNom() {return nom;}
	
	public int getNiveau() {return niveau;}

	public void setNom(String nom) {this.nom = nom;}
	
	public void setNiveau(int niveau) {this.niveau = niveau;}
	
}
