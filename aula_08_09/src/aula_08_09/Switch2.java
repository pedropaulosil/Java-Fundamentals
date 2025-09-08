package aula_08_09;

import java.util.Scanner;

public class Switch2 {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira as notas do aluno:");
			
	int nota1 = ler.nextInt();
	int nota2 = ler.nextInt();
	int nota3 = ler.nextInt();
	int nota4 = ler.nextInt();
	int media = (nota1 + nota2 + nota3 + nota4)/4;
	//De 5 a 10 – Aprovado; 
	//Acima de 3 e menor que 5 – Conselho; 
	//Menor ou igual a 3 – Reprovado.   
	
	System.out.println("A media do aluno eh: " + media +".");
	System.out.println("Insira a media para verificar a condicao do aluno:");
	int escolha = ler.nextInt();
	switch (escolha) {
	case 4: 
		System.out.println("Conselho");
		return;
	case 5,6,7,8,9,10:
		System.out.println("Aprovado");
		return;
	case 1,2,3:
		System.out.println("Reprovado");
		return;
		default:
	break;
	}

}

}
