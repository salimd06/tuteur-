package jeu;

import java.util.ArrayList;

public class Plateau {
	ArrayList<Integer> deux;
	ArrayList<Integer> trois;
	ArrayList<Integer> quatre;
	ArrayList<Integer> cinq;
	ArrayList<Integer> six;
	ArrayList<Integer> sept;
	ArrayList<Integer> huit;
	ArrayList<Integer> neuf;
	ArrayList<Integer> dix;
	ArrayList<Integer> onze;
	ArrayList<Integer> douze;
	
	public void Plateau() {
		this.deux = new ArrayList<Integer>() {{
			add(132);
			add(121);
			add(110);
		}};
		this.trois = new ArrayList<Integer>() {{
			add(133);
			add(122);
			add(111);
			add(110);
			add(89);
		}};
		this.quatre = new ArrayList<Integer>() {{
			add(134);
			add(123);
			add(112);
			add(101);
			add(90);
			add(79);
			add(68);
		}};
		this.cinq = new ArrayList<Integer>() {{
			add(135);
			add(124);
			add(113);
			add(102);
			add(91);
			add(80);
			add(69);
			add(58);
			add(47);
		}};
		this.six = new ArrayList<Integer>() {{
			add(136);
			add(125);
			add(114);
			add(103);
			add(92);
			add(81);
			add(70);
			add(59);
			add(48);
			add(37);
			add(26);
		}};
		this.sept = new ArrayList<Integer>() {{
			add(137);
			add(126);
			add(115);
			add(104);
			add(93);
			add(82);
			add(71);
			add(60);
			add(49);
			add(38);
			add(27);
			add(16);
			add(5);
		}};
		this.huit = new ArrayList<Integer>() {{
			add(138);
			add(127);
			add(116);
			add(105);
			add(94);
			add(83);
			add(72);
			add(61);
			add(50);
			add(39);
			add(28);
		}};
		this.neuf = new ArrayList<Integer>() {{
			add(139);
			add(128);
			add(117);
			add(106);
			add(95);
			add(84);
			add(73);
			add(62);
			add(51);
		}};
		this.dix = new ArrayList<Integer>() {{
			add(140);
			add(129);
			add(118);
			add(107);
			add(96);
			add(85);
			add(74);
		}};
		this.onze = new ArrayList<Integer>() {{
			add(141);
			add(130);
			add(119);
			add(108);
			add(97);
		}};
			
		this.douze = new ArrayList<Integer>() {{
			add(142);
			add(131);
			add(120);
		}};
			
		
	}

	
}
