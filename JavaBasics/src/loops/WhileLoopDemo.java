package loops;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int PINinDB = 1234;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Please enter PIN");
		int PINEntered = k.nextInt();
		
		while(PINEntered != PINinDB) {
			System.out.println("Incorrect PIN, Try Again");
			PINEntered = k.nextInt();
		}
		
		System.out.println("Welcome Neha :)");
	}

}
