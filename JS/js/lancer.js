class lancer{
    constructor(statut){
        this.statut = statut;
    }

    LancerDe(){
        console.log("on lannce")
        socket.emit("lancer", {statut: 'oui'});
    
        socket.on("lancer", (lancer) => {
            console.log(`Vous avez tirer les dés suivant :${lancer}`)
            this.AfficherDe(lancer);
        });
    }

    AfficherDe(lesdes){
         var de = document.getElementById("resultat");
        de.innerText = `${lesdes[0]},${lesdes[1]},${lesdes[2]},${lesdes[3]}`;
    };
       


    
}