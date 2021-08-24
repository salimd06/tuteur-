package jeu;

public class Combinaison {
	private int choix1;
	private int choix2;
	
	Combinaison(){
		
	}
	
	Combinaison(int choix1,int choix2){
		this.choix1 = choix1;
		this.choix2 = choix2;
	}
	
	public int getChoix1() {
		return this.choix1;
	}
	
	public int getChoix2() {
		return this.choix2;
	}
}
