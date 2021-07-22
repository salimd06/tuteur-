function send(){
    console.log("on lannce")
    socket.emit("lancer", {statut: 'oui'});

    socket.on("lancer", (des) => {
        console.log(`Vous avez tirer les dés suivant :${des}`)
    });
    
}
