

public class Personagem {
    protected String nome;
    protected int forca;
    protected int velocidade;
    protected int poder;

    public Personagem(String nome, int forca, int velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public int getVelocidade() {
        return velocidade;
    }
    public int getPoder() {
    	return poder;
    }
}	