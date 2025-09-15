package aula12_09;

import javax.swing.JOptionPane;

public class EntradaSaidaInteiro {
	public static void main(String[] args) {
		//Solicita entrada de dados
	    String palavra1 = JOptionPane.showInputDialog(null, "Digite uma palavra", "Entrada de Texto", JOptionPane.QUESTION_MESSAGE);
	    String numeroTexto = JOptionPane.showInputDialog(null, "Digite um número", "Entrada de Número", JOptionPane.QUESTION_MESSAGE);
	    String decimalTexto = JOptionPane.showInputDialog(null, "Digite um número decimal", "Entrada de Número decimal", JOptionPane.QUESTION_MESSAGE);
	    String booleanTexto = JOptionPane.showInputDialog(null, "Digite true ou false", "Entrada de boolean", JOptionPane.QUESTION_MESSAGE);
	    
	    
	    // Conversão de String para int
	    int numeroInteiro = Integer.parseInt(numeroTexto);
	    
	 // Conversão de String para decimal
	    double numerodecimal = Double.parseDouble(decimalTexto);
	    
	 // Conversão de String para boolean
	    boolean numeroBoleano = Boolean.parseBoolean(booleanTexto);
	
	    // Saída de dados via JOptionPane
	   
	    JOptionPane.showMessageDialog(null,palavra1 + " - Isso é um texto" + "\n" +
	    								   numeroInteiro + " - Isso é um número inteiro" + "\n" +
	    								   numerodecimal + " - Isso é um número decimal" + "\n" +
	    								   numeroBoleano + " - Isso é um booleano", "Saída de Dados", JOptionPane.INFORMATION_MESSAGE);
	   
	    	
	    JOptionPane.showMessageDialog(null, "Informação de ERRO", "Erro", JOptionPane.ERROR_MESSAGE);
	    
	    JOptionPane.showMessageDialog(null, "Mensagem simples");
	    
	    JOptionPane.showMessageDialog(
	    	    null,
	    	    "Operação concluída com sucesso!",
	    	    "Informação",
	    	    JOptionPane.INFORMATION_MESSAGE
	    	);

	    int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	    
	    if(resposta == 1) {
	    	JOptionPane.showMessageDialog(null, "você digitou \"NÃO");
	    }else if(resposta == 0) {
	    	JOptionPane.showMessageDialog(null, "você digitou \"SIM");
	    }else {
	    	JOptionPane.showMessageDialog(null, "você digitou \"CANCELAR");
	    }


	}

		
		
}

