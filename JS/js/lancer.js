class lancer{
    constructor(de, connexion,combinaison){
        this.de = de;
        this.connexion = connexion;
        this.combinaison = combinaison;
    }

    LancerDe(){
        console.log("on lance")
        this.connexion.demanderLancer({statut: 'oui'});
        

    }

    AfficherDe(lesdes){ //roustine 
        this.lesdes = lesdes;
        console.log(`Vous avez tirer les dés suivant :${lesdes}`);
        console.dir(lesdes);
        this.de.innerText = `${lesdes[0]},${lesdes[1]},${lesdes[2]},${lesdes[3]}`;

        this.AfficheCombinaison(lesdes);
    };
    

    AfficheCombinaison(lesdes){
        var comb1 = lesdes[0]+lesdes[1];
        var comb2 = lesdes[2]+lesdes[3];
        var comb3 = lesdes[0]+lesdes[3];
        var comb4 = lesdes[1]+lesdes[2];
        var comb5 = lesdes[0]+lesdes[2];
        var comb6 = lesdes[1]+lesdes[3];

        this.combinaison.innerText = `${comb1} - ${comb2} | ${comb3} - ${comb4} | ${comb5} - ${comb6}`
    }

    ChoisirCombi1(){
        if(this.lesdes.length>0){
            this.connexion.EnvoyerCombi({choix1: this.lesdes[0]+this.lesdes[1],choix2 :this.lesdes[2]+this.lesdes[3]});
            this.lesdes = [];
        }
        
    }

    ChoisirCombi2(){
        if(this.lesdes.length>0){
            this.connexion.EnvoyerCombi({choix1: this.lesdes[0]+this.lesdes[3],choix2 :this.lesdes[1]+this.lesdes[2]});
            this.lesdes = [];
        }
       
    }

    ChoisirCombi3(){
        if(this.lesdes.length>0){
            this.connexion.EnvoyerCombi({choix1: this.lesdes[0]+this.lesdes[2],choix2 :this.lesdes[1]+this.lesdes[3]});
            this.lesdes = [];
        }
       
    }
    
    
}

if (typeof module !== 'undefined') {
    if (module.exports) module.exports = lancer;
}