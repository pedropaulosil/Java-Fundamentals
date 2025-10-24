package StringArray;

import java.util.Scanner;

public class TamanhoString {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in)
		int[]numeros = {10,20,30,40};
		int[]idade = {10,20,30};
		int tamanhoArray = numeros.length;
		//System.out.println("Tem o tamanho de " + numeros.length +" e " + idade.length);
		//System.out.println(tamanhoArray);
		
		//System.out.println("O "+ cadastro[0][0] + " tem " + cadastro[0][1]+ " anos.");
		String cadastro[][] = new String [4][3];
		System.out.println("Tamanho do Cadastro é "+ cadastro.length);
		cadastro.length = ler.next();
		//System.out.println("");
		
		cadastro[0][0] = "Abel";
		cadastro[0][1] = "23";
		cadastro[0][2] = "Rua 1";
		cadastro[1][0] = "Carlos";
		cadastro[1][1] = "29";
		cadastro[1][2] = "Rua 2";
		cadastro[2][0] = "Jovenal";
		cadastro[2][1] = "40";
		cadastro[2][2] = "Rua 3";
		cadastro[3][0] = "Saragosa";
		cadastro[3][1] = "50";
		cadastro[3][2] = "Rua 4";
		
	
		
		for(int i = 0; i<cadastro.length; i++) {
			cadastro[i][i]= ler.next();
			if (cadastro[i][0] == null) {
				break;
			} else {
				System.out.println(cadastro[i][0] + " " + cadastro[i][1] + " " + cadastro[i][2]);
			}
			
		}
		
	}
	
}
