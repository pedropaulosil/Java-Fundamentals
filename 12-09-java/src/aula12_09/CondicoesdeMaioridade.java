package aula12_09;

import javax.swing.JOptionPane;

public class CondicoesdeMaioridade {
	public static void main(String[] args) {
		while (true) {
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "nome",JOptionPane.QUESTION_MESSAGE);
			String idade = JOptionPane.showInputDialog(null, "Digite sua idade:", "idade",JOptionPane.QUESTION_MESSAGE);
		
			int idade1 = Integer.parseInt(idade);
			if (idade1 >= 18) {
			JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\n"+ "e você pode dirigir com seus " + idade1
					+ " anos!!"  + "\n"); }
			else {
				 JOptionPane.showMessageDialog(null, nome + "," + " você não pode dirigir...", "Erro", JOptionPane.ERROR_MESSAGE);
				 
			}
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if(resposta == 1) {
		    	JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
		    	System.exit(resposta);
		    }else if(resposta == 0) {
		    	JOptionPane.showMessageDialog(null, "Que bom, vamos continuar então!");
		    }else {
		    	JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
		    	System.exit(resposta);
		    }


		}

	}

}

