package reseau;
import reseau.Serveur;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestServeur {
	
	public void testServeur() {
		Serveur ser = new Serveur();
		ConnexionServeur connexion0 = new ConnexionServeur("127.0.0.1",10108);
		ser.setConnexion(connexion0);
		/* ConnexionServeur connexion = new ConnexionServeur("127.0.0.1",10108);
		assertEquals(connexion.serveur,ser.getConnexion().serveur); */
		// pointeur/objet/instance différente
	}
}
