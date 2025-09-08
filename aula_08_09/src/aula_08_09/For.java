package aula_08_09;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite a tabuada inicial:");
		int tabuadaInicio = ler.nextInt();
		System.out.println("Digite a tabuada final:");
		int tabuadaFim = ler.nextInt();

		
		for(int j = tabuadaInicio; j <= tabuadaFim; j++) {
		for (int i = 1; i<=10; i++) {
			
			System.out.println(j + "X" + i + " = " + j * i );
		}
		
	}
}

}
