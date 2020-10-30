package ca.java.example;

public class Circle extends Shape {

	private double radius;
	public final double PI = 3.14;
	
	/*
	 * constructor
	 */
	public Circle(double radius) {
		super();
		setRadius(radius);
	}
	
	/*
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/*
	 * @param radius
	 */
	public void setRadius(double radius) {
		if(radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 1;
		}
	}

	
	@Override
	public double getArea() {
		return radius * radius * PI;
	}

	
}
