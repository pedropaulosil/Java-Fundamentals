package pacote1;
import java.util.Scanner;

public class jogo3 {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	String[][] cadastro = new String[5][3];
		for (int i = 0; i < cadastro.length; i++) {
			System.out.println("nome:");
			cadastro[i][0] = scanner.nextLine();
			System.out.println("CPF:");
			cadastro[i][1] = scanner.nextLine();
			System.out.println("telefone:");
			cadastro[i][2] = scanner.nextLine();
		} System.out.println("Roubaram o Sao Paulo");
	}
}
