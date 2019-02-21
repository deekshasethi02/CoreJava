package Interface;

public class PhoneTest {

	public static void main(String[] args) {
		
		ITelephone telephone = new Deskphone();
		telephone.powerOn();
		telephone.callPhone(54865);
		telephone.dial(54865);
		telephone.isRinging();
		telephone.answer();
	
		
	}

}
