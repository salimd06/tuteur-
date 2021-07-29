package jeu;

import java.util.ArrayList;


public class Des {
	private ArrayList<Integer> des ;
	
	public Des() {
		des = new ArrayList<Integer>();
		des.add(0);
		des.add(0);
		des.add(0);
		des.add(0);
		
	}
	
	public Des(int de1, int de2, int de3, int de4) {
		des = new ArrayList<Integer>();
		des.add(de1);
		des.add(de2);
		des.add(de3);
		des.add(de4);
		
	}
	
	public void setDe(int de1, int de2, int de3, int de4) {
		des.set(0,de1);
		des.set(1,de2);
		des.set(2,de3);
		des.set(3,de4);
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
