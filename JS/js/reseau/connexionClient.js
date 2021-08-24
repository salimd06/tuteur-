class connexionClient {
    constructor(socket){
        this.socket = socket;
    }

    setLancer(controleur) {
        this.lancer = controleur;
    }

    init() {
        // on s'abonne
        this.socket.on("lancer", (lancer) => {
            this.lancer.AfficherDe(lancer);
        });
        
        // et on déclenche le jeu
        this.socket.emit("identification",{nom: "ss",niveau: 1})
      }

    demanderLancer(attachement) {
        this.socket.emit("lancer", attachement);
    }

    EnvoyerCombi(attachement){
        this.socket.emit("combinaison",attachement);
        console.log(attachement);
    }
 
      
}




