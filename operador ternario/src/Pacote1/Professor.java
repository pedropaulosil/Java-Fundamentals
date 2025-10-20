package Pacote1;

public class Professor extends Cadastro implements SenhaSistema {
	protected double salário;
	protected int senhaEscola;
	protected int senhaSistema;
	
	public Professor (String nome, String cpf, String endereço, String telefone, double salário, String senha, int senhaSistema, int senhaEscola) {
		super(nome, cpf, endereço, telefone);
		this.salário = salário;
		this.senhaSistema = senhaSistema;
		this.senhaEscola = senhaEscola;
	}
	@Override 
		public void sistema (int senhaS) {
			if(this.senhaSistema == senhaS)
				System.out.println("Acesso liberado");
			else {
				System.out.println("Senha invalída");
			}
		
		}
	}
