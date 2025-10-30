package ContaBancaria;

import javax.swing.JOptionPane;

public class ContaCorrente {
	
	private int numeroCC;
	private double saque;
	private String cliente;
	private int agencia;
	private double saldo;
	private int senha;
	private static int totalConta = 1000;
	private int senhadigitada;
	
	public ContaCorrente(int agencia, String cliente,double saldo, int senha) {
		this.numeroCC = totalConta;
		this.saque = saque;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
		this.senha = senha;
		
		this.totalConta++;
		
		JOptionPane.showMessageDialog(null,
				"Conta nº " + this.numeroCC + " criada com sucesso");
	}
	
	//Metodo autentica senha
	
	public void autenticasenha (int senha, int agencia, int numeroconta) {
		boolean autentica = false;
		
		if (this.agencia == agencia && this.senha== senhadigitada && this.numeroCC==numeroconta) {
			System.out.println("Conta logada com sucesso.");
		}
	
	}
	//Metodo saque
	
	public void sacar (double saque, double novoSaldo){
	boolean confirmaSaldo = false;
		
		if (this.saque < this.saldo) {	
		novoSaldo = this.saldo - this.saque;
		saque = novoSaldo;
		confirmaSaldo = true;
		System.out.println("Saque efetuado em " + saque + "R$");
	}   else {
		System.out.println("Saldo insuficiente, tente outro valor.");
	}
}
	//Metodo saldo
	public void novosaldo(int novosaldo){
			System.out.println("Esse eh seu Saldo: " + novosaldo);
		}
	//Metodo transferencia
	public void tranferencia(double valor, double saldo) {
		if ( valor>saldo) {
			System.out.println( "Pode realizar a tranferencia.");
		}
	}
	
	//Metodo trocar senha
public boolean alterarSenha (int senhaAtual,int novaSenha){ 
		
		boolean confirmaSenha = false;
		if (senhaAtual == this.senha) 
	{	
		
		this.senha = novaSenha;
		confirmaSenha = true;	
	}   return confirmaSenha;
 }
	
}



	