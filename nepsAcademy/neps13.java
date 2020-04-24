//Java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner
		Scanner input = new Scanner(System.in);
		
		//atribuindo variaveis
		int A, M;
		
		A = input.nextInt();
		M = input.nextInt();
		
		if( A+M <= 50) {
			
			System.out.println("S");
			
		}
		else {
			
			System.out.println("N");
		}
		
		input.close();
		

	}

}
