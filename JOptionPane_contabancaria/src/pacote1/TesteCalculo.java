package pacote1;

import javax.swing.JOptionPane;

public class TesteCalculo {
	
	//public static void main(String[] args) {
		
		//calculo2numeros op1 = new calculo2numeros();
		//op1.somar2();
		
		//calculo2numeros op2 = new calculo2numeros();
		//op2.somar3();
		
		//calculo2numeros op3 = new calculo2numeros();
		//op3.somar4();
		
		//calculo2numeros op4 = new calculo2numeros();
		//op4.somar3();
		
	//}
	public static void main(String[] args) {
		Calculo2numeros cal01 = new Calculo2numeros();
		
		JOptionPane.showMessageDialog(null, cal01.somar(2,5));
		
		JOptionPane.showMessageDialog(null, cal01.somar(3,3,3));
		
		JOptionPane.showMessageDialog(null, cal01.somar(2,2,2,2,2));
	
	}
	
}