package testdaaula3;

import java.util.Scanner;

public class conversaolitros {
	
	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = ler.nextLine();
       
        
        Scanner lersobr = new Scanner(System.in);
        System.out.println("Digite seu sobrenome");
        String sobrenome = lersobr.nextLine();
       
        
        
        Scanner lerint = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();
      
        
        
        Scanner lercpf = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        int cpf = ler.nextInt();
        
        
        Scanner lerano = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        int ano = ler.nextInt();
       
        
        System.out.println("\n"+ "Seu nome eh " + nome + " " + sobrenome  + "\n" + "Sua idade eh " + idade +"\n" + "Seu cpf eh " + cpf +"\n" + "Nasceu em " + ano);
       
        
	}

}
