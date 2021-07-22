window.addEventListener("DOMContentLoaded", () => init());

const socket = io('http://localhost:10109/');

function init() {
  
  socket.emit("identification",{nom: 'Salim',niveau: 1})
  
  socket.on("coucou", () => {
              console.log("connecté !")
          });
}


