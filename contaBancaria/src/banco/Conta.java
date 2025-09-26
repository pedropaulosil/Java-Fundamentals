package banco;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conta {
    Cliente cliente;
    private int agencia;
    private int numero;
    private int senha;
    private int senhaDeTranzacao;
    private int numeroConta;
    private double tranferencia;
    private double deposito;
    private double saldo;
    private static int totalConta = 1000;

    	public Conta (Cliente cliente, int numeroAgencia,double saldo, int senhaAcesso, int senhaDeTranzacao) {
    		
    		this.cliente = cliente;
    		this.agencia = numeroAgencia;
    		this.saldo = saldo;
    		this.senha = senhaAcesso;
    		this.senhaDeTranzacao = senhaDeTranzacao;
    		this.numeroConta = totalConta;
    		this.deposito = deposito;
    		
    		totalConta++;		
    	}

    	public void saque() {
    		boolean confirmado = false;
    		Scanner ler = new Scanner(System.in);
    		System.out.println("Coloque o valor do saque:");
    		double valor = ler.nextInt();
    		
    		if(this.saldo >= valor) {
    			this.saldo -= valor;
    			confirmado = true;
    			
    			System.out.println("Agora o saldo eh:" + saldo );
    	
    		}else {
    			System.out.println("Saldo insuficiente.");
    
    		confirmado = false;}
    	}
   	
    	
    	private boolean confirmaSenhaTranzacao() {
    		boolean confirmado = false;
    		Scanner ler = new Scanner(System.in);
    		System.out.println("Confirme a senha:");
    		int senha = ler.nextInt();    		
    		if(this.senhaDeTranzacao == senha) {
    			confirmado = true;
    		}		
    		return confirmado;
    	}
    	
    	
    	public void confirmaAcesso(int agencia, int conta, int senhaAcesso) {
    		
    		if(this.agencia == agencia && 
    				this.numeroConta == conta && this.senha == senhaAcesso) {
    			
    			int navegar = 0;
    			
    			do {
    				
    				navegar = Integer.parseInt(JOptionPane.showInputDialog(null, "EScolha a opção!" + "\n" +
    									          "1 - Ver saldo" + "\n" +
    						                      "2 - Saque" + "\n" + "3 - Depósito" + "\n" + "4 - Transferência" + "\n" +
    									          "5 - Sair"));
    				
    				if(navegar == 1 ) {
    					verSaldo();
    				}
    				
    				if(navegar == 2) {
    					saque();
    				}
    				if(navegar == 3) {
        				deposito();
    				}
    				if(navegar == 4) {
        				deposito();
    				}
    				
    			}while (navegar != 5);
    		}
    	}
    	
    	private void verSaldo() {
    		System.out.println("Saldo atual:" + saldo);
    		Scanner ler = new Scanner(System.in);
    	}
    	
    	private void deposito() {
        	System.out.println("Digite o valor de depósito");
        	Scanner ler = new Scanner(System.in);
        	double deposito = ler.nextDouble();
        	saldo = saldo + deposito;
        	System.out.println("Agora seu saldo é: "+ saldo);
    		
    	}
    	
    	private void tranferencia() {
        	System.out.println("Digite o valor de tranferencia");
        	Scanner ler = new Scanner(System.in);
        	double tranferencia = ler.nextDouble();
        	saldo = saldo - tranferencia;
        	System.out.println("Agora seu saldo é: "+ saldo);
    		
    	
    	}   		
 }
    
    //Saldo
 


    //Saque



    //Depósito
    


    //Transferência
   



    // Método para exibir as informações da conta
    

