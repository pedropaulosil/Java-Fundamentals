package aula_08_09;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero referente a idade da pessoa:");
		// Selecione o número que corresponde a faixa de idade da pessoa: 
		// 0 – menor que 18 meses – recém nascido; 
		// 1 – de 18 meses a 2 anos incompleto - Bebê; 
		// 2 – de 2 a 12 anos incompleto - Criança; 
		// 3 – de 12 a 18 anos incompleto - Adolescente; 
		// 4 – de 18 a 60 anos incompleto - Adulto; 
		// 5 – 60 anos ou mais - Idoso; 
		int escolha = ler.nextInt();
		
		switch (escolha) {
		case 0:
			System.out.println("A pessoa eh um recém nascido.");
			return;
		case 1:
			System.out.println("A pessoa eh um bebê.");
			return;
		case 2:
			System.out.println("A pessoa eh uma criança.");
			return;
		case 3:
			System.out.println("A pessoa eh um adolecente.");
			return;
		case 4:
			System.out.println("A pessoa eh um adulto.");
			return;
		case 5:
			System.out.println("A pessoa eh um idoso.");
			return;
		default:
		break;
		}

	}

}
