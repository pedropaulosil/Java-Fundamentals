package JogodoNumeroSecreto;
import java.util.Random;
import java.util.Scanner;

public class Secreto1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner ler = new Scanner(System.in);
		int secreto = rand.nextInt(11);
		
		for (int escolha = 0; escolha < 11; escolha++) {
			System.out.println("Tente advinhar o numero (de 0 a 10):");
			Scanner scanner = new Scanner (System.in);
			escolha = scanner.nextInt();
			if (escolha == secreto) {
				System.out.println("Parabens, voce acertou!!");
				break;
			} else {
				System.out.println("Voce nao acertou, tente novamente.");
				
			} 
		}  System.out.println("Obrigado por Jogar!");
			
	}
	
}
