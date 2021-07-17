package jeu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIdentification {
	public void testIdentification() {
		Identification id = new Identification("John");
		assertEquals(id.getNom(),"John");
		id.setNom("Karmen");
		assertEquals(id.getNom(),"Karmen");
	}
}