package inheritance;

public class Currency {
	
	private double amount;
		
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	public double getAmount() {
		return amount;
	}
	
	public Currency(double amount) {
		this.amount = amount;
	}

	public Currency() {
	
	}
	
	public double conversion() {
		return 1;
	}

	

	public double conversion(double amount, Currency convertTo) {
		// TODO Auto-generated method stub
		return 1;
	}

}
