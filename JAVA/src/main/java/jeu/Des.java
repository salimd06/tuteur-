package jeu;

import java.util.ArrayList;


public class Des {
	private ArrayList<Integer> des ;
	private ArrayList<Integer> combinaison;
	
	public Des() {
		des = new ArrayList<Integer>();
		combinaison = new ArrayList<Integer>();
		des.add(0);
		des.add(0);
		des.add(0);
		des.add(0);
		
		combinaison.add(0);
		combinaison.add(0);
		combinaison.add(0);
		combinaison.add(0);
		combinaison.add(0);
		combinaison.add(0);
	}
	
	public Des(int de1, int de2, int de3, int de4) {
		des.add(de1);
		des.add(de2);
		des.add(de3);
		des.add(de4);
		
		combinaison.add(de1+de2);
		combinaison.add(de1+de3);
		combinaison.add(de1+de4);
		combinaison.add(de2+de3);
		combinaison.add(de2+de4);
		combinaison.add(de3+de4);
	}
	
	public void setDe(int de1, int de2, int de3, int de4) {
		des.set(0,de1);
		des.set(1,de2);
		des.set(2,de3);
		des.set(3,de4);
		
		combinaison.set(0,de1+de2);
		combinaison.set(1,de1+de3);
		combinaison.set(2,de1+de4);
		combinaison.set(3,de2+de3);
		combinaison.set(4,de2+de4);
		combinaison.set(5,de3+de4);
	}
	
	public ArrayList<Integer> getDes() {
		return des;
	}
	
	public int getDe1() {
		return des.get(0);
	}
	
	public int getDe2() {
		return des.get(1);
	}
	
	public int getDe3() {
		return des.get(2);
	}
	
	public int getDe4() {
		return des.get(3);
	}
}
