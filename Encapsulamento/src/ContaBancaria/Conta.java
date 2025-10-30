package ContaBancaria;

public class Conta {

		private String agencia;
		private int numeroConta;
		private String cliente;
		private double saldo;
		private int senha;
		private static int ultimaConta = 56120;
		private double saque;
		
		public Conta (String agencia, String cliente, double saldo, int senha, double saque) 
		{ this.senha = senha;
		  this.agencia = agencia;
		  this.numeroConta = ultimaConta;
		  this.cliente = cliente;
		  this.saldo = saldo;
		  this.saque = saque;
		  
		  ultimaConta++;
		 System.out.println("A conta " + numeroConta + " foi criada com sucesso!");
		}

		public boolean alterarSenha (int senhaAtual,int novaSenha){ 
			
			boolean confirmaSenha = false;
			if (senhaAtual == this.senha) 
		{
			this.senha = novaSenha;
			confirmaSenha = true;	
		}   return confirmaSenha;
	}
	 
	     
		public boolean sacar (double saque, double novoSaldo)
		{
			boolean confirmaSaldo = false;
			
			if (this.saque < this.saldo) 
		{	novoSaldo = this.saldo - this.saque;
			saque = novoSaldo;
			confirmaSaldo = true;
			System.out.println("Saque efetuado em " + saque + "R$");
		}   else 
		{
			System.out.println("Saldo insuficiente, tente outro valor.");
			
		} return confirmaSaldo; 
	}


		public String getAgencia() {
			return agencia;
		}

		public int getNumeroConta() {
			return numeroConta;
		}

		public String getCliente() {
			return cliente;
		}

		public double getSaldo() {
			return saldo;
		}

		public int getSenha() {
			return senha;
		}

		public static int getUltimaConta() {
			return ultimaConta;
		}





		
	}

