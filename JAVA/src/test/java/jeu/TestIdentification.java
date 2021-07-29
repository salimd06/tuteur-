package jeu;

import static org.junit.Assert.*;
import org.junit.Test;



public class TestIdentification {

	@Test
	public void testIdentification() {
		Identification id = new Identification("John",10);
		assertEquals(id.getNom(),"John");
		id.setNom("Karmen");
		assertEquals(id.getNom(),"Karmen");
	}
}
