
public class CarParking {

	public void showCar(int car[][]) {
		for(int i=0;i<car.length;i++) {
			for(int j=0;j<car[i].length;j++) {
				System.out.print(" "+car[i][j] + " ");
			
			}
			System.out.println();
		}
		
	}
	
	
	public void parkCar(int car[][]) {
	
		for(int i =0;i<car.length;i++) {
			for(int j=0;j<car[i].length;j++) {
				if(car[i][j]==0) {
					car[i][j] =1;
					break;
				}
			}
		}

	}
public void removeCar(int car[][],int index1,int index2) {
	car[index1][index2]=0;
}
	
}
