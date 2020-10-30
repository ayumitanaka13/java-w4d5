package ca.java.example;

public class Driver {

	public static void main(String[] args) {
		// can not instanticate object of abstract class
		// Animal animal = new Animal();

		Dog d1 = new Dog();
		d1.talk();
		
		System.out.println();
		Duck q1 = new Duck();
		q1.talk();

		System.out.println();
		Cat c1 = new Cat();
		c1.talk();
	}
}
