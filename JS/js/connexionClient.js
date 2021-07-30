class connexionClient {
    constructor(socket){
        this.socket = socket;
    }

    init() {
  
        this.socket.emit("identification",{nom: 'Salim',niveau: 1})
      }
      
}




