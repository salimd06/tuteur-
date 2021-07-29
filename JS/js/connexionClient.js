class connexionClient {
    constructor(socket){
        this.socket = socket;
    }

    init() {
  
        this.socket.emit("identification",{nom: 'Salim',niveau: 1})
      }
      
}
this.socket = io('http://localhost:10109/');
window.addEventListener("DOMContentLoaded", () => new connexionClient(socket).init());



