class lancer{
    constructor(de, connexion, statut){
        this.de = de;
        this.connexion = connexion;
        this.statut = statut;
    }

    LancerDe(){
        console.log("on lance")
        this.connexion.demanderLancer({statut: 'oui'});
    

    }

    AfficherDe(lesdes){
        console.log(`Vous avez tirer les dés suivant :${lesdes}`)
        this.de.innerText = `${lesdes[0]},${lesdes[1]},${lesdes[2]},${lesdes[3]}`;
    };
       


    
}

if (typeof module !== 'undefined') {
    if (module.exports) module.exports = lancer;
}