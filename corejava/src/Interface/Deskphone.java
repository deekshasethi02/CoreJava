package Interface;

public class Deskphone implements ITelephone {

	@Override
	public void powerOn() {
		System.out.println("phone switched on");

	}

	@Override
	public void dial(int phoneNumber) {
		
			System.out.println("dialing number :"+phoneNumber);
	

	}

	@Override
	public void answer() {
		System.out.println("call answered");

	}

	@Override
	public boolean callPhone(int phoneNumber) {
		
		return false;
	}

	@Override
	public boolean isRinging() {
		
		return false;
	}

}
