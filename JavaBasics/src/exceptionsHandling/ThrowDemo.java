package exceptionsHandling;

public class ThrowDemo {
	public static void main(String[] args) {
		String name = "Neha";
		
		if(name.equals("Pankaj")) {
			throw new ArithmeticException();
		}
		else {
			System.out.println("Its a good name.");
		}
	}
}
