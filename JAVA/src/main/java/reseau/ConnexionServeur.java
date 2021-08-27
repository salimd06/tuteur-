package reseau;

import java.util.HashMap;
import java.util.Map;

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
	//Identification leClient;
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
   
        	
        	Identification leClient = new Identification(identification.getNom());
        	gestionnaire.joueurs.put(gestionnaire.joueurs.size()+1,socketIOClient);
        	//gestionnaire.AjouterJoueur(leClient);
            System.out.println("Le client est "+identification.getNom());
          //  System.out.println(gestionnaire.nombreJoueur());
            System.out.println(gestionnaire.joueurs.toString());
            System.out.println(gestionnaire.joueurs.size());
            //EnvoyerDes(socketIOClient,gestionnaire);
            if(gestionnaire.joueurs.size()==2) {
            	System.out.println("yaaah");
            	Listener();
            }
            
        }
    });
    
  
    
    
    

}
	public void Listener() {
				// réception d'un lancer
		serveur.addEventListener("lancer", Lancer.class, new DataListener<Lancer>() {
		    public void onData(SocketIOClient socketIOClient, Lancer lancer, AckRequest ackRequest) throws Exception {
		        System.out.println("Un lancé a été demandé "+lancer.getStatut());
		       
		         EnvoyerDes(gestionnaire.joueurs.get(gestionnaire.getjoueurCourant()),gestionnaire);
		         System.out.println(gestionnaire.joueurs.get(1));
		    }
		});
		
		serveur.addEventListener("combinaison", Combinaison.class, new DataListener<Combinaison>() {
		    public void onData(SocketIOClient socketIOClient, Combinaison combinaison, AckRequest ackRequest) throws Exception {
		        System.out.println("La combinaison choisi est "+combinaison.getChoix1()+" "+combinaison.getChoix2());		         
		        
		        if(combinaison.getChoix1()==-10) {
		        	gestionnaire.PasserTour();
		        }
		         
		         //On renvoi les dés tirés
		         
		    }
		});
	}
	
	private void EnvoyerDes(SocketIOClient socketIOClient,GestionnaireJeu gs) {
		System.out.println(gs.LesDes());
		socketIOClient.sendEvent("lancer",gs.LesDes());
	}
	
	public void demarrer() {
		// TODO Auto-generated method stub
		serveur.start();
	}


}

