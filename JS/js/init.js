this.socket = io('http://127.0.0.1:10110/');
window.addEventListener("DOMContentLoaded", () => new connexionClient(socket).init());