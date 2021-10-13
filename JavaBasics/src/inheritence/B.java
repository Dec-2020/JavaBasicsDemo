package inheritence;

public class B extends D{
	
	public void Month() {
		System.out.println("September");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.Month();
		b.Date();
		b.NextYear();
	}
}
