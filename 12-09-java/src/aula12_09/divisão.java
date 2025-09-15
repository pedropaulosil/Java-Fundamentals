package aula12_09;

import javax.swing.JOptionPane;

public class divisão {
	public static void main(String[] args) {
		while(true) {
		 String n1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:", "numero 1",JOptionPane.QUESTION_MESSAGE);
		 String n2 = JOptionPane.showInputDialog(null, "Digite o segundo número:","numero  2",JOptionPane.QUESTION_MESSAGE);
		 
		 float numero1 = Integer.parseInt(n1);
		 float numero2 = Integer.parseInt(n2);
		 float div = numero1 / numero2;
		 JOptionPane.showMessageDialog(null, "Os números são: \n" + numero1 +" e "+ numero2 + "\n" + "O resultado é: " + div);
			
		 
		
		 int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if(resposta == 1) {
		    	JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
		    	System.exit(resposta);
		    }else if(resposta == 0) {
		    	JOptionPane.showMessageDialog(null, "Que bom, vamos continuar então!");
		    }else {
		    	JOptionPane.showMessageDialog(null, "Cancelado, volte sempre!");
		    	System.exit(resposta);
		 
		 
		    	}
		} 
	}
}
	

