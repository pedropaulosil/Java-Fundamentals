package banco;

public class Cliente {
	
	protected String nome;
	protected String cpf;
	protected String telefone;
	
	public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
		
		this.nome = nomeCliente;
		this.cpf = cpfCliente;
		this.telefone = telefoneCliente;
	}

	public String getNomeCliente() {
		
		return nome;
	}	

	public String getTelefoneCliente() {
		return telefone;
	}
	
}
	



