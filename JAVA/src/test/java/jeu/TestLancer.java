package jeu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLancer {

	@Test
	void testLancer() {
		Lancer f = new Lancer("oui");
		assertEquals("oui",f.getStatut());
	}
	
	@Test
	void testFaireLancer() {
		Lancer f = new Lancer();
		Des lesdes = new Des(8,8,8,8);
		f.FaireLancer(lesdes);
		int resultat = 0;
		if(lesdes.getDe1()>0 && lesdes.getDe1() < 7 &&
				lesdes.getDe2()>0 && lesdes.getDe2() < 7 &&
				lesdes.getDe3()>0 && lesdes.getDe3() < 7 &&
				lesdes.getDe4()>0 && lesdes.getDe4() < 7) {
			resultat = 1;
		}
		assertEquals(resultat,1);
	}

}
