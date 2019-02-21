package inheritance;

public class Euro extends Currency {
	
		public Euro() {
	
		}
		@Override
		public double conversion(double amount, Currency convertTo) {
			double converted =0;
			
			if(convertTo.getClass().isInstance(new Rupee())) {
				 converted=amount*83.64;
				//System.out.println(converted);
			}
			
			if(convertTo.getClass().isInstance(new Dollar())) {
				converted = amount*1.16;
				//System.out.println(converted);
			}
			return converted;
		}
}
