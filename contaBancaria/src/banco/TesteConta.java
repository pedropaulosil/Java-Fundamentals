package banco;
import java.util.Scanner;
import javax.swing.JOptionPane;

    	public class TesteConta {
    		public static void main(String[] args) {

    						Scanner ler = new Scanner(System.in);
	    					Cliente cli01 = new Cliente("Ismael", "123.456.789-05", "(11)91234-5678");
	    					Cliente cli02 = new Cliente("Waldir", "111.456.789-05", "(11)91234-5690");
	    					Conta cc1 = new Conta(cli01, 100, 1000, 1234, 123);
	    					Conta cc2 = new Conta(cli01, 100, 1000, 1234, 123);
	    					
	    					String nome = cc1.cliente.getNomeCliente();
	    					System.out.println(nome);
	    					
	    					cc1.confirmaAcesso(100, 1000, 1234);
	    					cc2.dadosCliente(111);
	    					
    				}
    		}
    		
  
  

