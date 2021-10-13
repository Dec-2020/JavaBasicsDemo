package exceptionsHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		try {
			System.out.println("Enter no.1");
			int no1 = s.nextInt();

			System.out.println("Enter no.2");
			int no2 = s.nextInt();

			System.out.println("Result : " + (no1 / no2));
		}
		
		catch (ArithmeticException ex) {
			System.out.println("Do not Enter zero in input.");
		}
		
		catch (InputMismatchException ex) {
			System.out.println("Enter integer value as input.");
		}
		
		catch (Exception ex) {
			System.out.println("Enter valid input.");
		}
		
		finally{
			System.out.println("Thank You !!");
		}
	}
}
