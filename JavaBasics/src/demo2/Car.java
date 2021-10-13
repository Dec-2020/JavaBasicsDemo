package demo2;

public class Car {
	
	private String color;
	private String engineType;

	public Car(String colorOfCar, String typeOfEngine){
		color = colorOfCar;
		engineType = typeOfEngine;
	}

	public static void main(String[] args) {
		Car audi = new Car("Silver","Petrol");
		Car mercedes = new Car("Black","Disel");
		
		audi.PrintCarInfo();
	}

	private void PrintCarInfo() {
		System.out.println("Color is " + color);
		System.out.println("Engine Type is " + engineType);
	}
}
