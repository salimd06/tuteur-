
const assert = require('chai').assert;
const lancer = require('../js/lancer');



describe("test de lancer", () => {
    it("affichage des dés", () => {
        // mock de documnet à la main // sinon des mocks plus évolués avec sinon
        const de = {};
        de.innerText = "";

        let l = new lancer(de);
        let param = [1,2,3,4];
        l.AfficherDe(param);
        assert.equal(de.innerText, "1,2,3,4");
      });
});


