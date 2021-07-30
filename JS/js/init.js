
window.addEventListener("DOMContentLoaded", () => {
    // mise en place du réseau
    const socket = io('http://127.0.0.1:10110/');
    const connexion = new connexionClient(socket);
    const de = document.getElementById("resultat");
    const controleur = new lancer(de, connexion);
    connexion.setLancer(controleur);

    // abonnement aux actions utilisateurs
    const bouton = document.querySelector("button.big-button");
    bouton.addEventListener("click", () => controleur.LancerDe());

    connexion.init();
});