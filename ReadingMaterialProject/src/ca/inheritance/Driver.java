package ca.inheritance;

public class Driver {

	public static void main(String[] args) {
		TextBook b1 = new TextBook("Introduction to Java", 500, "Programming", 1);
		Novel n1 = new Novel("Adventure in Canada", 300, "Ayumi", "SF");
		System.out.println(b1);
		System.out.println(n1);
	}
}
