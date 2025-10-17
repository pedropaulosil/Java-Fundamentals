package arena1;

import java.util.Random;
import java.util.Scanner;

public class Oponentes {
	Scanner ler = new Scanner(System.in);
	Random ran = new Random();
	
	protected String[]oponente = {"Mamba Negra", "Chacal do Deserto", "Dama da Morte", "Naja",
								  "Paquiderme", "Múmia", "Mestre Orc", "Dr. Fúnebre",
							 	  "Morte Certa", "Monstro do Pântano"};
	                         //vel|força
	protected int[][]poder = {{60, 200, 0},  //Mamba Negra
						      {40, 310, 0},  //Chacal
						      {60, 200, 0},  //Dama
						      {40, 310, 0},  //Naja
						      {60, 200, 0},  //Paquiderme
						      {40, 310, 0},  //Múmia
						      {60, 200, 0},  //Mestre
						      {40, 310, 0},  //Dr.
						      {60, 200, 0},  //Morte
						      {40, 310, 0}}; //Monstro
	protected int lutasRealizadas = 0;
							 

	public void getLutador(Guerreiro g) {
		int busca = 0;
		
		while(busca == 0) {
			
			int round = ran.nextInt(poder.length);
			System.out.println("Valor aleátorio" + round);
			
			for(int i = 0; i < poder.length; i++) {
				
				if(poder[round][2] == 0) {
					poder[round][2] = 1;
					
					
					System.out.println("Seu Oponente é " + oponente[round] + ". Escolha 1 (velocidade), 2 (força)");
					int escolha = ler.nextInt();
					
					if(escolha == 1) {
						if(g.velocidade > poder[round][0]) {
							System.out.println("Parabéns, você derrotou " + oponente[round]);
							//break;
						}else {
							System.out.println("Infelizmente, você foi derrotado por  " + oponente[round]);
							//break;
						}
							
					}else if(escolha == 2) {
						if(g.forca > poder[round][1]) {
							System.out.println("Parabéns, você derrotou " + oponente[round]);
							//break;
						}else {
							System.out.println("Infelizmente, você foi derrotado por  " + oponente[round]);
							//break;
						}
					}
					lutasRealizadas++;
					
				}else {
					break;
				}
			}
			
			if(lutasRealizadas == poder.length) {
				System.out.println("Lutas encerradas!!" +". Quer lutar novamente? 0 (sim) 1 (não)");
				
				busca = ler.nextInt();
				
				if(busca == 0) {
					for(int i = 0; i < poder.length; i++) {
						poder[i][2] = 0;
						lutasRealizadas = 0;
					}
				}else {
					System.out.println("Até a próxima");
				}
			}	
		}	

	}
}
