package demo;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		//implicit type casting
		int x = 10;
		double y = 55.10; 
		double z = x;
		System.out.println(z);
		
		//explicit type casting
		String a = "20";
		int b = Integer.parseInt(a);
		System.out.println(b);
		
		int c = (int)y;
		System.out.println(c);
	}

}
