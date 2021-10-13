package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Paris");
		cities.add("Mumbai");
		cities.add("Bali");
		cities.add("Londan");
		cities.add("Europe");
		
		for(String t : cities) {
			System.out.println(t);
		}
		
		System.out.println();
		
		System.out.println("Total number of ellements: "+ cities.size());
		
		System.out.println("Item at index 1: "+ cities.get(1));
		
		System.out.println("Index of Mumbai: "+ cities.indexOf("Mumbai"));

		System.out.println("Is Bali in the list: "+ cities.contains("Bali"));
	}

}
