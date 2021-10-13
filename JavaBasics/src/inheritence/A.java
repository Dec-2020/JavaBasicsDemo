package inheritence;

public class A extends D{
	
	public void Day() {
		System.out.println("Sunday");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.Day();
		a.Date();
		a.NextYear();
	}

}
