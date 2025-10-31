package package1;

public class Operador extends Funcionario implements InterfaceSistema {
Cadastro cadastro;
double bonificacao = 0.10;

public Operador (Cadastro c) {
	this.cadastro = c;
}

@Override
public void senha(int senha) {
	if (cadastro.senha == senha){
		System.out.println("Acesso liberado.");
	}else {
		System.out.println("Acesso negado.");
		}
	}
}
