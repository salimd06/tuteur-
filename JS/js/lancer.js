class lancer{
    constructor(statut){
        this.statut = statut;
    }

    LancerDe(){
        console.log("on lannce")
        socket.emit("lancer", {statut: 'oui'});
    
        socket.on("lancer", (lancer) => {
            console.log(`Vous avez tirer les dés suivant :${lancer}`)
        });
    }
}