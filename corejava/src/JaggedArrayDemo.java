
public class JaggedArrayDemo {
	public static void main(String []  args) {
		
	
	int [][]arr = new int [2][];
	
	arr[0] = new int[3];
	arr[1] = new int[4];
	
	arr[0][0] = 10;
	arr[0][1] = 20;
	arr[0][2] = 30;
	
	arr[1][0] = 100;
	arr[1][1] = 200;
	arr[1][2] = 300;
	arr[1][3] = 400;
	
	for(int i=0;i < arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j] +" ");
		}
	System.out.println();
	}
	
	System.out.println("arr[0] hascode:" +arr[0]);
	
	int  [][]temp = new int[3][];
	
	temp[0] = new int[2];
	temp[1] = new int[2];
	
	temp[0][0] = 10;
	temp[0][1] = 20;
		
	temp[1][0] = 100;
	temp[1][1] = 200;
	temp[2][0]=1;
			temp[2][1]=2;
	for(int i=0;i < temp.length;i++) {
		for(int j=0;j<temp[i].length;j++) {
			System.out.print(temp[i][j] +" ");
		}
	System.out.println();
	}
	
}

}