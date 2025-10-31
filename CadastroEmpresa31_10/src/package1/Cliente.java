package package1;

public class Cliente implements InterfaceSistema {
	Cadastro cadastro;
	public Cliente (Cadastro s) {
		this.cadastro = s;
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
