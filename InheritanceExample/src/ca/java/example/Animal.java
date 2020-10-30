package ca.java.example;

public abstract class Animal {

//	private String name;
//	
//	public String getName() {
//		return name;
//	}
	
	public abstract void talk();

	public void eat() {
		System.out.println("I am an animal. I can eat.");
	}
	public void sleep() {
		System.out.println("I am an animal. I can sleep.");
	}
	
}
