package package1;
import java.util.Scanner;

public class AcessoSistema {
	
	Scanner scanner = new Scanner(System.in);
	
	public void AcessoSistema(InterfaceSistema s){
		System.out.println("Insira a senha: ");
		int senha = scanner.nextInt();
		s.senha(senha);
	}
	
	
	
}

