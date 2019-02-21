package inheritance;

public class AppStartup {

	public static void main(String[] args) {
		
		CalculateCurrency currency = new CalculateCurrency(100.00,new Rupee(),new Dollar());
		currency.conversion(100.00,new Dollar());
		
		CalculateCurrency currency1 = new CalculateCurrency(100.00,new Rupee(),new Euro());
		currency1.conversion(100.00,new Euro());
				
		}

}
