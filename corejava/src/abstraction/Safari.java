package abstraction;

public class Safari  extends Car{

	public Safari(String registrationNumber) {
		super(registrationNumber);
	}

	public Safari() {
		super();
	}

	@Override
	public void drive() {
		System.out.println("drive safari with power sterring"+getRegistrationNumber());
		
		
	}

	@Override
	public void stop() {
		System.out.println("stop safari with power break"+getRegistrationNumber());
		
	}

}
