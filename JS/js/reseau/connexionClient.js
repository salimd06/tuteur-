class connexionClient {
    constructor(socket){
        this.socket = socket;
    }

    setLancer(lancer) {
        this.lancer = lancer;
    }

    init() {
        // on s'abonne
        this.socket.on("lancer", (lancer) => {
            this.lancer.AfficherDe(lancer);
        });

        // et on déclenche le jeu
        this.socket.emit("identification",{nom: 'Salim',niveau: 1})
      }

    demanderLancer(attachement) {
        this.socket.emit("lancer", attachement);
    }
      
}




