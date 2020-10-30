package ca.java.example;

public class Rectangular extends Shape {
	
	private double length;
	private double width;
	
	/*
	 * constructor
	 */
	public Rectangular(double length, double width) {
		setLength(length);
		setWidth(width);
	}
	
	/*
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	
	/*
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	
	/*
	 * @param length
	 */
	public void setLength(double length) {
		if(length > 0) {
			this.length = length;
		} else {
			this.length = 1;
		}
	}
	
	/*
	 * @param width
	 */
	public void setWidth(double width) {
		if(width > 0) {
			this.width = width;
		} else {
			this.width = 1;
		}
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
}
