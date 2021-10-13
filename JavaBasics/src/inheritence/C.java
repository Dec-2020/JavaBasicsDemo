package inheritence;

public class C extends D{
	
	public void Year() {
		System.out.println("2022");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.Year();
		c.Date();
		c.NextYear();
	}
}
