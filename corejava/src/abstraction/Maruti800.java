package abstraction;

public class Maruti800 extends Car {
	
	public Maruti800(String registrationNumber) {
		super(registrationNumber);
	}

	public Maruti800() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drive() {
		System.out.println("Drive maruti with normal steering");
		
	}

	@Override
	public void stop() {
		System.out.println("stop maruti with normal break");
	
		
	}

	
}
