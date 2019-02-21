package inheritance;

public class Rupee extends Currency {
	
	public Rupee() {
	
	}
	
	@Override
	public double conversion(double amount, Currency convertTo) {
			double converted =0;
			
			if(convertTo.getClass().isInstance(new Dollar())) {
				 converted=amount*0.014;
				
			}
			
			if(convertTo.getClass().isInstance(new Euro())) {
				converted=amount*0.012;
				
			}
			return converted;
		}
	}	

