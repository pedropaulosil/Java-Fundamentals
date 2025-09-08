package aula_08_09;

import java.util.Scanner;

public class Saque {
	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
	    int opcao = 0;
	    
	    while (opcao != 4) {
	    System.out.println("1 - SAQUE / 2 - DEPOSITO / 3 - TRANFERENCIA / 4 - SAIR");
	    
	    opcao = ler.nextInt();
	    switch (opcao) {
		case 1: 
			System.out.println("Saque realizado" + "\n" +  "0 - Voltar ao menu" + "\n" + "4 - sair");
		    opcao = ler.nextInt();
		    break;
		case 2:
			System.out.println("Deposito realizado" + "\n" +  "0 - Voltar ao menu" + "\n" + "4 - sair");
			break;
		case 3:
			System.out.println("Tranferencia realizada" + "\n" +  "0 - Voltar ao menu" + "\n" + "4 - sair");
			break;
		case 4:
			System.out.println("Saiu..");
			break;
			default:
		break;
			}
	    }
	}
}
