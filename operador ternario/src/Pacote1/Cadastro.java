package Pacote1;

public class Cadastro {
	public String nome;
	public String cpf;
	public String endereço;
	public String telefone;

	
	public Cadastro (String nome, String cpf, String endereço, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		this.telefone = telefone;	
		System.out.println("O cadastro" +nome+ "foi criado");
	}
	public void exibirDados() {
		System.out.println("O usuário " +nome+ "com o CPF " + endereço+ "com o " + "telefone " + telefone);
		
	}
}
