package ca.java.inheritance.example2;

public class ProvinceTax extends FederalTax {
	
	private int provinceTaxRate;
	private String province;
	
	public ProvinceTax(int provinceTaxRate, String province) {
		super();
		setProvincetaxRate(provinceTaxRate);
		setProvince(province);
	}
	
	
	public int getProvinceTaxRate() {
		return provinceTaxRate;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvincetaxRate(int provinceTaxRate) {
		if(provinceTaxRate > 0) {
			this.provinceTaxRate = provinceTaxRate;
		} else {
			this.provinceTaxRate = 0;
		}
	}
	
	public void setProvince(String province) {
		if(!province.isEmpty() || !province.equalsIgnoreCase(null)) {
			this.province = province;
		} else {
			this.province = "Unknown";
		}
	}
	
	public double getTaxAmount(double totalAmount) {
//		double federalTax = super.getTaxAmount(totalAmount);
//		double provinceTax = (totalAmount * provinceTaxRate) / 100;
//		return federalTax + provinceTax;
		
		return super.getTaxAmount(totalAmount) +
				(totalAmount * provinceTaxRate) / 100;
	}
	
//	public double getTotal() {
//		return 0;
//	}
	
}
