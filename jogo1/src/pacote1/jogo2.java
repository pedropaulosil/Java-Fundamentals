package pacote1;

import java.util.Scanner;

public class jogo2 {
	public static void main(String[] args) {
		String[] nomes = new String[4];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome:");
			nomes[i] = scanner.nextLine();
		}

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	} 
}  
