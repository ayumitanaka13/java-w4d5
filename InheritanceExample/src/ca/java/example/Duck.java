package ca.java.example;

public class Duck extends Animal {
	public void swim() {
		System.out.println("I am a duck. I can swim");
	}


	@Override
	public void talk() {
		System.out.println("I am a duck. Quack Quack!");
	}
}
