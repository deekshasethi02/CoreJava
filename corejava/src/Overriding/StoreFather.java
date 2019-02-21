package Overriding;

public class StoreFather extends StoreGrandFather {
	@Override
	public void storeManagement() {
		System.out.println(" Manual management by father");
	}
	
	@Override
	public void storeAccount()
	{
		System.out.println("Manual accounting by father");
		
	}
	@Override
	public void manageTransport()
	{
		System.out.println("transportation by bus or truck");
	}

}
