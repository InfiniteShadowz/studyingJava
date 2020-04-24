//java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//atribuindo variaveis
		int L, areaQuadrado;
		
		//input
		L = input.nextInt();
		
		//processamento
		areaQuadrado = L * L;
		
		
		//output
		System.out.println(areaQuadrado);
		
		//close do input
		input.close();
		

	}

}
