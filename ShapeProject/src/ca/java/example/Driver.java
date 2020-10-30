package ca.java.example;

public class Driver {

	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
		System.out.println("The area of circle is " + c1.getArea());
		
		Rectangular r1 = new Rectangular(3.2, 4.5);
		System.out.println("The area of rectangular is " + r1.getArea());
	}
}
