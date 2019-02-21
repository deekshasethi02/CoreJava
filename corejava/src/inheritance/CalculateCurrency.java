package inheritance;

public class CalculateCurrency   {

	Currency convertFrom;
	Currency convertTo;
	double amount;
	
	public CalculateCurrency(double amount, Currency convertFrom, Currency convertTo) {
	
		
		this.convertFrom = convertFrom;
		this.convertTo = convertTo;
		convertFrom.setAmount(amount); 
		}
	
		
		public void conversion(double amount,Currency convertTo) {
			
			double converted = convertFrom.conversion(amount, convertTo);
			System.out.println(converted);
	
}
}
