
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {


    private static final Random random = new Random();

    public static void main(String[] args) {
     
        int jogarNovamente;
        do {
            jogar();
            
            jogarNovamente = JOptionPane.showConfirmDialog(
                null, 
                "Você gostaria de jogar novamente?", 
                "Fim de Jogo", 
                JOptionPane.YES_NO_OPTION
            );

        } while (jogarNovamente == JOptionPane.YES_OPTION);
    }

    public static void jogar() {
     
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Duelo de Atributos!");

        String nomeJogador = JOptionPane.showInputDialog("Digite o nome do seu Herói:");
        
        if (nomeJogador == null || nomeJogador.trim().isEmpty()) {
            return; 
        }

        Personagem jogador = new Personagem(nomeJogador, 15, 15);

      
        List<Inimigos> inimigos = new ArrayList<>();
        inimigos.add(new Inimigos("Goblin"));
        inimigos.add(new Inimigos("Orc"));
        inimigos.add(new Inimigos("Cavaleiro"));

        boolean jogadorVenceuTudo = true;

     
        for (Inimigos inimigo : inimigos) {
            
            String mensagem = String.format(
                "Um %s aparece!\n\n" +
                "SEUS ATRIBUTOS:\nForça: %d\nVelocidade: %d\n\n" +
                "ATRIBUTOS DO INIMIGO:\nForça: %d\nVelocidade: %d\n\n" +
                "Qual atributo você usará para o confronto?",
                inimigo.getNome(),
                jogador.getForca(), jogador.getVelocidade(),
                inimigo.getForca(), inimigo.getVelocidade()
            );

            Object[] opcoes = {"Usar Força", "Usar Velocidade"};
            int escolha = JOptionPane.showOptionDialog(
                null, mensagem, "Batalha!", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            );
            
            if (escolha == JOptionPane.CLOSED_OPTION) {
                jogadorVenceuTudo = false;
                break;
            }

      

            int atributoJogador;
            int atributoInimigo;
            String atributoUsado;

            if (escolha == 0) {
                atributoJogador = jogador.getForca();
                atributoInimigo = inimigo.getForca();
                atributoUsado = "Força";
            } else { 
                atributoJogador = jogador.getVelocidade();
                atributoInimigo = inimigo.getVelocidade();
                atributoUsado = "Velocidade";
            }

         
            float chanceDeVitoria = (float) atributoJogador / (atributoJogador + atributoInimigo);

         
            float resultadoAleatorio = random.nextFloat();

            boolean vitoriaNaRodada = resultadoAleatorio < chanceDeVitoria;

           
            String chanceEmPercentual = String.format("%.0f%%", chanceDeVitoria * 100);

            String resultadoStr = String.format(
                "Você usou %s (%d) contra %s do %s (%d).\n\n" +
                "Sua chance de vitória era de: %s\n" +
                "Para vencer, o resultado precisava ser menor que sua chance.\n\n" +
                "Resultado: %f!",
                atributoUsado, atributoJogador, atributoUsado, inimigo.getNome(), atributoInimigo,
                chanceEmPercentual,
                resultadoAleatorio*100,"%",
                vitoriaNaRodada ? "VITÓRIA" : "DERROTA"
            );

            JOptionPane.showMessageDialog(null, resultadoStr);

            if (!vitoriaNaRodada) {
                jogadorVenceuTudo = false;
                break;
            }
        }
        

        if (jogadorVenceuTudo) {
            JOptionPane.showMessageDialog(null, "PARABÉNS! Você superou todos os desafios!");
        } else {
            JOptionPane.showMessageDialog(null, "Você foi derrotado. Mais sorte da próxima vez!");
        }
    }
}