package Overriding;

public class StoreMe extends StoreFather {
	@Override
	public void storeManagement() {
		System.out.println(" Computerized management by me");
	}
	@Override
	public void storeAccount()
	{
		System.out.println("Computerized accounting by me");
		
	}
	
	@Override
	public void manageTransport()
	{
		System.out.println("transportation by cargo");
	}
}
