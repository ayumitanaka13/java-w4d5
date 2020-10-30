package ca.java.inheritance.example2;

public class FederalTax {

	public final int FEDERAL_TAX_RATE = 5;
	
	public double getTaxAmount(double totalAmount) {
		return (totalAmount * FEDERAL_TAX_RATE) / 100;
	}
}
