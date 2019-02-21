
public class CarParkingTest {

	public static void main(String[] args) {
		int car[][]= new int[5][];
		car[0]=new int[]{1,0,1,1,1};
		car[1]= new int [] {1,1,1,1,};
		car[2]= new int[] {1,0,1};
		car[3]= new int[] {1,1};
		car[4]= new int [] {1};
		
		CarParking carParking = new CarParking();
		System.out.println("before parking:");
		carParking.showCar(car);
		System.out.println("after parking:");
		carParking.parkCar(car);
		carParking.showCar(car);
		System.out.println("car removed:");
		carParking.removeCar(car,0,4);
		carParking.showCar(car);
	}
}
