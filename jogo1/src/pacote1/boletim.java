package pacote1;
import java.util.Scanner;

public class boletim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			String [][]boletim = new String [3][4];
			for (int i = 0; i <boletim.length; i++) {
				
					System.out.println("Nome:");
					boletim[i][0] = scanner.nextLine();
					System.out.println("Nota bimestre 1:");
					boletim[i][0] = scanner.nextLine();
					System.out.println("Nota bimestre 2:");
					boletim[i][0] = scanner.nextLine();
					System.out.println("Nota bimestre 3:");
					boletim[i][0] = scanner.nextLine();
					System.out.println("Nota bimestre 4:");
					boletim[i][0] = scanner.nextLine();
			}
			
	for (int i =0; i < boletim.length; i++) {
		System.out.println(boletim[i][0] + "-" + boletim[i][1]+ " - " + boletim[i][2] + " - "+ boletim[i][3] + " - " + boletim[i][4]);
		}
	
	}
}
