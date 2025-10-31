package package1;

public class Supervisor extends Funcionario implements InterfaceSistema {

	Cadastro cadastro;
	double bonificacao = 0.15;
	
	public Supervisor (Cadastro f) {
		this.cadastro = f;
	}


	@Override
	public void senha(int senha) {
		if (cadastro.senha == senha) {
			System.out.println("Acesso liberado.");
		} else {
			System.out.println("Acesso negado.");
		}
	}

}
