const { createServer } = require("http");
const { Server } = require("socket.io");
const assert = require("chai").assert;
const client = require("../js/connexionClient");


// with { "type": "commonjs" } in your package.json
// const { createServer } = require("http");
// const { Server } = require("socket.io");
// const Client = require("socket.io-client");
// const assert = require("chai").assert;

describe("my awesome project", () => {
  let serverSocket, client;

  before((done) => {
    const httpServer = createServer();
    client = new Server(`http://localhost:10109/`);
    httpServer.listen(() => {
      const port = httpServer.address().port;
      client = new Client(`http://localhost:10109/`);
      client.on("connection", (socket) => {
        serverSocket = socket;
      });
      client.on("connect", done);
    });
  });

  after(() => {
    client.close();
  });

  it("should work", (done) => {
    client.on("coucou", (arg) => {
      assert.equal(arg, "connecté !");
      done();
    });
    serverSocket.emit("hello", "world");
  });

  it("should work (with ack)", (done) => {
    serverSocket.on("hi", (cb) => {
      cb("hola");
    });
    client.emit("hi", (arg) => {
      assert.equal(arg, "hola");
      done();
    });
  });
});