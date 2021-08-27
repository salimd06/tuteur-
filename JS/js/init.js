
    window.addEventListener("DOMContentLoaded", () => {
    // mise en place du réseau
    const socket = io('http://127.0.0.1:10112/');
    const connexion = new connexionClient(socket);
    const de = document.getElementById("resultat");
    const combinaison = document.getElementById("combinaison");
    const controleur = new lancer(de, connexion,combinaison);
    connexion.setLancer(controleur);

    // abonnement aux actions utilisateurs
    const bouton = document.querySelector("button.big-button");
    bouton.addEventListener("click", () => controleur.LancerDe());
    const combi1 = document.querySelector(".combi1");
    combi1.addEventListener("click", () => controleur.ChoisirCombi1());
    const combi2 = document.querySelector(".combi2");
    combi2.addEventListener("click", () => controleur.ChoisirCombi2());
    const combi3 = document.querySelector(".combi3");
    combi3.addEventListener("click", () => controleur.ChoisirCombi3());

    const bouton2 = document.querySelector("button.big-button2");
    bouton2.addEventListener("click", () => controleur.ChoisirPasserTour());

    connexion.init();

    
});


