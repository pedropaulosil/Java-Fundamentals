package Pacote1;

public class ClasseDrive {
	public static void main(String[] args) {
		Professor p1 = new Professor("Ismael", "1234", "Rua jardins", "30.000", 100, "123", 200, 0);
		AcessoSistema as = new AcessoSistema();
		as.acessoSistemaUtil(p1);
	}

}
