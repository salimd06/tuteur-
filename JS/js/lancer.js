class lancer{
    constructor(connexion, statut){
        this.connexion = connexion;
        this.statut = statut;
    }

    LancerDe(){
        console.log("on lannce")
        this.connexion.demanderLancer({statut: 'oui'});
    

    }

    AfficherDe(lesdes){
        console.log(`Vous avez tirer les dés suivant :${lesdes}`)
         var de = document.getElementById("resultat");
        de.innerText = `${lesdes[0]},${lesdes[1]},${lesdes[2]},${lesdes[3]}`;
    };
       


    
}