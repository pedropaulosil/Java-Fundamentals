package ContaBancaria;

import javax.swing.JOptionPane;

public class TesteConta {
	public static void main(String[] args) {

		        // Criando uma nova conta corrente
		        ContaCorrente conta = new ContaCorrente(1234, "João Silva", 1000.00, 123456);

		        // Autenticando com senha correta
		        conta.autenticasenha(123456, 1234, 0);

		        // Tentativa de saque
		        conta.sacar(200.00, 0); // Parâmetro "novoSaldo" não é usado corretamente dentro do método original

		        // Exibindo o saldo após saque
		        conta.novosaldo((int) (1000.00 - 200.00)); // Isso apenas imprime um valor estimado

		        // Tentando transferir valor (o método só imprime mensagem, não transfere de fato)
		        conta.tranferencia(100.00, 800.00);

		        // Trocando senha com a senha atual correta
		        boolean senhaAlterada = conta.alterarSenha(123456, 654321);
		        if (senhaAlterada) {
		            System.out.println("Senha alterada com sucesso!");
		        } else {
		            System.out.println("Senha atual incorreta.");
		        }

		        // Tentando autenticar com a nova senha
		        conta.autenticasenha(654321, 1234,0);
		   }
}
	