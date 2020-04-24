import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T1, T2, T3;
		
		T1 = input.nextInt();
		T2 = input.nextInt();
		T3 = input.nextInt();
		
		
		if (T1 < T2 & T1 < T3) {
			System.out.println("1");
			if (T2 < T3) {
				System.out.println("2");
				System.out.println("3");
			}
			if (T3 < T2) {
				System.out.println("3");
				System.out.println("2");
			}
			
		}
			
		else if (T2 < T1 & T2 < T3) {
			System.out.println("2");
			if (T1 < T3) {
				System.out.println("1");
				System.out.println("3");
			}
			if (T3 < T1) {
				System.out.println("3");
				System.out.println("1");
			}
		}
		
		else {
			System.out.println("3");
			if (T1 < T2) {
				System.out.println("1");
				System.out.println("2");
			}
			
			if (T2 < T1) {
				System.out.println("2");
				System.out.println("1");
			}
		}
			
		
		input.close();	
		
	}

}
