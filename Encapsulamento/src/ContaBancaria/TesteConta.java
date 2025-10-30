package ContaBancaria;

public class TesteConta {

		public static void main(String[] args)
		{
			Conta cc1 = new Conta("100-0", "Pedro",  100.00,  123, 200.00);
			Conta cc2 = new Conta ("100-0","Marcos", 100.00,  222, 50.00);
			Conta cc3 = new Conta ("100-0","Ana Maria", 100.00, 333, 50.00);
			
			String conta;
			
			conta = cc1.getAgencia();
			System.out.println(conta);
			
			System.out.println(cc2.getCliente() + " - " + cc2.getAgencia() + " - " + cc2.getNumeroConta());
			
			if(cc1.alterarSenha(123, 555)) 
				{
					System.out.println("Senha alterada com sucesso");
				} else {
					System.out.println("Senha Invalida");
			}
		
			if(cc1.alterarSenha(555, 123)) 
				{
					System.out.println("Senha alterada com sucesso");
				} else 
				{
					System.out.println("Senha Invalida");
				}

			if(cc1.sacar(100, 50)) 
			{
			} else 
			{
			}
		}
}
			
			

