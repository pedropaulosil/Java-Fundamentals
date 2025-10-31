package package1;

import java.util.Scanner;

public class TesteSistema {
	public static void main(String[] args) {
		
		System.out.println("Digite Seu cargo: operador, supervisor ou cliente. ");
		Scanner scanner = new Scanner(System.in);
		String ler = scanner.next();
		
		AcessoSistema aceS = new AcessoSistema();
		
		Cadastro cadOperador = new Cadastro("5484651165", "joel", 123);
		Cadastro cadSupervisor = new Cadastro("5445645486", "Carlos", 222);
		Cadastro cadCliente = new Cadastro("154561135", "Taylor", 444);
		
		Operador op1 = new Operador(cadOperador);
		Supervisor sp1 = new Supervisor(cadSupervisor);
		Cliente cl1 = new Cliente(cadCliente);
		aceS.AcessoSistema(op1);
		aceS.AcessoSistema(sp1);
		aceS.AcessoSistema(op1);
		
		if (ler == "operador") {
			aceS.AcessoSistema(op1);
		} else if (ler == "supervisor") {
			aceS.AcessoSistema(sp1);
		} else if (ler == "cliente") {
			aceS.AcessoSistema(cl1);
		}

		

		

		
	
	}

}
