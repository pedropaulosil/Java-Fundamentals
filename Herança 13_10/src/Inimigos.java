
public class Inimigos extends Personagem {


    public Inimigos(String nome) {
        
        super(nome, 0, 0); 
        
     
        switch (nome.toLowerCase()) {
            case "goblin":
             
                this.forca = 8;
                this.velocidade = 20;
                break;
            case "orc":
            
                this.forca = 18;
                this.velocidade = 10;
                break;
            case "cavaleiro":
                
                this.forca = 16;
                this.velocidade = 16;
                break;
            default:
            
                this.forca = 5;
                this.velocidade = 5;
                break;
        }
    }

 String[]adversário = {"Dragão","Cobra","Cascavel","Gorila-rei"};
 int [][]poder = {{90,500},{70,700},{90,500},{60,700}};

}