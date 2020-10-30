package ca.java.inheritance.example2;

public class Driver {
	
	public static void printInfo(ProvinceTax obj, double totalAmount) {
		System.out.println("The tax amount of " + totalAmount + 
				" in " + obj.getProvince() + " : " +
				obj.getTaxAmount(totalAmount));

	}

	public static void main(String[] args) {
		double totalAmount = 100;
		ProvinceTax bcTax = new ProvinceTax(7, "BC");
		ProvinceTax abTax = new ProvinceTax(0, "AB");
		
		printInfo(bcTax, totalAmount);
		printInfo(abTax, totalAmount);
	}

}
