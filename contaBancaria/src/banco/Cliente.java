package banco;

public class Cliente {
	
	protected String cliente;
	protected String cpf;
	protected String telefone;
	
	public Cliente(String nomeCliente, String cpfCliente, String telefoneCliente) {
		
		this.cliente = nomeCliente;
		this.cpf = cpfCliente;
		this.telefone = telefoneCliente;
	}

	public String getNomeCliente() {
		return cliente;
	}	

	public String getCpfCliente() {
		return cpf;
	}

	public String getTelefoneCliente() {
		return telefone;
	}


}
	

