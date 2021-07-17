package reseau;

import com.corundumstudio.socketio.AckRequest;
import com.corundumstudio.socketio.SocketIOServer;
import com.corundumstudio.socketio.listener.ConnectListener;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOClient;



public class ConnexionServeur {
	
	SocketIOServer serveur;
	
	
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
	}

	public void demarrer() {
		// TODO Auto-generated method stub
		serveur.start();
		
	}

	public void setMoteur(Serveur serveur2) {
		// TODO Auto-generated method stub
	}
}
