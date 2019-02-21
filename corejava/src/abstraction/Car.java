package abstraction;
/**
 *  
 * @author deeksha.sethi
 *
 */
public abstract class Car {
private String registrationNumber;
	public Car(String registrationNumber) {
		this.registrationNumber =registrationNumber;
	}
	public Car() {
		this.registrationNumber="dho-111";
		drive();
		fillTank();
		drive();
		stop();
	}

	public abstract void drive();
	
	public abstract void stop();
	
	public void fillTank() {
		System.out.println("Fueling car..reg no"+getRegistrationNumber());
		
	}
	public String getRegistrationNumber() {
		return registrationNumber;
		
			
		
	}
}
