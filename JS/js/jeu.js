class jeu{
    constructor(width,height){
        this.width = width;
        this.height = height;
        
    }

    dessinerJeu(){
        var c = document.getElementById("myCanvas");
        var ctx = c.getContext("2d");  
        var nbRond = 11;
        var nbLigne = 13;
        
        var tabIndice = new Array(0,1,2,3,4,6,7,8,9,10,11,
                                 12,13,14,15,17,18,19,20,21,22,23,
                                 24,25,29,30,31,32,33,34,35,36,40,
                                    41,42,43,44,45,46,52,53,54,
                                    55,56,57,63,64,65,66,67,75,
                                       76,77,78,86,87,
                                          88,98,
                                           99,
                                          109)
        var Indice  = 0;
        var larg = this.width/nbRond;
        var haut = this.height/nbLigne;
        
        for(var k=0; k<nbLigne;k++){
            
            for(var i=0; i < nbRond;i++){
           var dessiner = true;
            if(tabIndice.includes(Indice)){
                dessiner = false;
            }

            if(dessiner === true){ 
                ctx.beginPath();
                ctx.fillStyle="#FFFFFF"
                ctx.arc(larg*i+40, haut*k+25, 20, 0, 2 * Math.PI);  
                ctx.fill();
                ctx.strokeText(i+2, larg*i+40, haut*k+25);
            
            }
            Indice++;
           
        }
        
        larg = this.width/(nbRond);
        
        }
        
        
        
       
    }
}

