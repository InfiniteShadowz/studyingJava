//java


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//declarando variaveis
		int A, B, S;
		
		//input
		A = input.nextInt();
		B = input.nextInt();
		
		//operacao de soma
		S = A + B;
		
		//Sout
		System.out.println(S);
		
		//ffecha input
		input.close();
		

	}

}
