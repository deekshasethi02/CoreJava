package inheritance;

public class Dollar extends Currency {
	int amount;
	
	public Dollar(int amount) {
		super();
		this.amount = amount;
	}
	public Dollar() {
		super();
	}
	@Override
	public double conversion(double amount, Currency convertTo) {
		double converted =0;
		
		if(convertTo.getClass().isInstance(new Rupee())) {
			 converted= amount*72.20;
		
		}
		
		if(convertTo.getClass().isInstance(new Euro())) {
			converted= amount*0.86;
			
		}
		return converted;
	}
}
