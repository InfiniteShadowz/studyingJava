//java

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//declarando variaveis
		int A, B, media;
		
		A = input.nextInt();
		B = input.nextInt();
		
		//processamento
		media = (A + B) / 2;
		
		//sout
		System.out.println(media);
		
		input.close();

	}

}
