package StringArray;
import javax.swing.JOptionPane;

public class IMC {
	public static void main(String[] args) {
		int continua = 1; 
		do {
			JOptionPane.showMessageDialog(null, "Seja vem vindo a calculadora de IMC. "); 
			 String altura = JOptionPane.showInputDialog("Coloque sua altura: ");
			 
			 float alturaint = Float.parseFloat(altura);
			 String peso = JOptionPane.showInputDialog("Coloque seu peso: ");
			 float pesoint = Float.parseFloat(peso);	
			 
			 float imc = pesoint/ (alturaint * alturaint);
			 JOptionPane.showInputDialog(null, "O resultado é", imc);
				 try {
					 if(imc <18) {
						 JOptionPane.showMessageDialog(null, "Magreza extrema."); 
					 }
					 else if(imc > 24) {
						 JOptionPane.showMessageDialog(null, "Obesidade"); 
					 }
				 	}
					 
					 catch(ArrayIndexOutOfBoundsException e) {
						 JOptionPane.showMessageDialog(null, "Imc está normal"); 				 
					 }
					 
				 
				 continua = JOptionPane.showConfirmDialog(null,"Refazer?","Quer utilizar o sofware novamente?",JOptionPane.YES_NO_OPTION);
		} while (continua == JOptionPane.YES_OPTION);
	}
		
			
}
   

