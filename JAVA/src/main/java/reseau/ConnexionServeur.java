package reseau;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.listener.DataListener;

import jeu.Combinaison;
import jeu.Des;
import jeu.GestionnaireJeu;
import jeu.Identification;
import jeu.Lancer;

import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;



public class ConnexionServeur {
	
	SocketIOServer serveur;
	Identification leClient;
	GestionnaireJeu gestionnaire = new GestionnaireJeu();
	
	SocketIOServer getServeur() { return serveur;}
	
	void setServeur(SocketIOServer serveur) {this.serveur = serveur;}
	
	
	public ConnexionServeur(String ip, int port) {
		
		Configuration config = new Configuration();
		config.setHostname(ip);
		config.setPort(port);
		
		setServeur(new SocketIOServer(config));

		getServeur().addConnectListener(new ConnectListener(){
			public void onConnect(SocketIOClient socketIOClient) {
				System.out.println("connexion de "+socketIOClient.getRemoteAddress());
			}
		});
		
		 // réception d'une identification
    serveur.addEventListener("identification", Identification.class, new DataListener<Identification>() {
        public void onData(SocketIOClient socketIOClient, Identification identification, AckRequest ackRequest) throws Exception {
   
        	leClient = new Identification(identification.getNom());
        	gestionnaire.AjouterJoueur(leClient);
            System.out.println("Le client est "+identification.getNom());
            System.out.println(gestionnaire.nombreJoueur());
            EnvoyerDes(socketIOClient,gestionnaire);
            
            
        }
    });
    
   
    		// réception d'un lancer
    serveur.addEventListener("lancer", Lancer.class, new DataListener<Lancer>() {
        public void onData(SocketIOClient socketIOClient, Lancer lancer, AckRequest ackRequest) throws Exception {
            System.out.println("Un lancé a été demandé "+lancer.getStatut());
            if(gestionnaire.FaireUnLancer(leClient))  {
            	
             
             //On renvoi les dés tirés
             
            }
             EnvoyerDes(socketIOClient,gestionnaire);
        }
    });
    
    serveur.addEventListener("combinaison", Combinaison.class, new DataListener<Combinaison>() {
        public void onData(SocketIOClient socketIOClient, Combinaison combinaison, AckRequest ackRequest) throws Exception {
            System.out.println("La combinaison choisi est "+combinaison.getChoix1()+" "+combinaison.getChoix2());
             
            
             
             //On renvoi les dés tirés
             
        }
    });
    
    
    

}
	
	private void EnvoyerDes(SocketIOClient socketIOClient,GestionnaireJeu gs) {
		System.out.println("helo");
		socketIOClient.sendEvent("lancer",gs.LesDes());
	}
	
	public void demarrer() {
		// TODO Auto-generated method stub
		serveur.start();
	}


}

