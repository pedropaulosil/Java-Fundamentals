package TratarErros;

import java.util.Scanner;

public class ExemploExcecao {
	public static void main(String[] args) {
		int[] arr = new int [3];
			try {
				arr[2] = 10;
				
			}	
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("erro: Índice fora dos limites. ");
				}	
			catch (Exception e) {
				System.out.println("erro: Índice fora dos limites. ");
				} 	
			finally {
				System.out.println("erro: Índice fora dos limites. ");
				}
			
			
	} 

}
