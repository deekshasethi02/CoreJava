
public class TwoDimensionalArray {

	public static void main(String[] args) {
		String [][]person = new String[2][];
		person[0]= new String[3];
		person[1] = new String[4];
		
		person[0][0]="mr.";
		person[0][1]= "mrs.";
		person[0][2]="miss.";
		
		person[1][0]="prateek";
		person[1][1]= "Surya";
		person[1][2]= "Aishwarya";
		person[1][3]= "Rohan";
	
		
		for(int i =0;i<person.length;i++) {
			
			for(int j=0;j<person[i].length;j++) {
				System.out.println(person[i][j] +" ");
			}
		}
	}

}
