package Pacote1;
import java.util.Scanner;

	interface SenhaSistema{
		void sistema(int senhaS);
	}
	public class AcessoSistema{
		Scanner ler = new Scanner(System.in);
		public void acessoSistemaUtil (SenhaSistema s) {
			System.out.println("Digite a senha do sistema: ");
			int senha = ler.nextInt();
			s.sistema(senha);
			
			}
	}
 