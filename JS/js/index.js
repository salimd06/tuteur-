window.addEventListener("DOMContentLoaded", () => init());

const socket = io('http://localhost:10108/');

function init() {
  
  socket.emit("Identification",{nom: 'Michel'})
  
  const bouton = document.getElementById("jouer");

  socket.on("connect", () => {
              console.log("connecté !")
              socket.emit("Nom", {nom: 'All good'});
          });
}

function send() {
  socket.emit("Lancer", {statut: 'oui'});
}
