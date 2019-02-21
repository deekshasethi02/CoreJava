
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int choice ;
		int [] arr = new int[3];
		int arrays[] = null;
		Scanner scanner = new Scanner(System.in);
		int i = 0,count = 0;
		while (true) {
			System.out.println("1. insert element");
			System.out.println("2. display element list");
			System.out.println("0. to exit");
		System.out.println("Enter choice");
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1 :
			
//			index++;
//			count++;
			if(i < arr.length) {
//				capacity = Arrays.copyOf(capacity, size+1);
//				size++;
				System.out.println("Enter element for array index : " +i );
				arr[i]= scanner.nextInt();
				++i;
			}
			else {
				count = i + 1;
				arrays = Arrays.copyOf(arr, count);
				System.out.println("Enter element for array index : " +i );
				arrays[i]= scanner.nextInt();
				++i;
			}
			//System.out.println("enter elements in array : ");
			//capacity[index] = scanner.nextInt();
			break;
		case 2 :
			System.out.println("Display values of list");
			for(int j =0;j < i;j++) {
				System.out.println(arrays[j] +" ");
			}
			break;
		case 0:
			System.exit(0);
			break;
			default :
				System.out.println("invalid choice");
				break;
		}
//		System.out.println("Do you want to continue? [yes/no]");
//		conti = scanner.next();
//		}while(conti.equals("yes"));
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		int a[] = new int[10];
//		
//		System.out.println("Enter 10 elements in the array : ");
//		for (int i = 0; i < 10; i++) {
//			a[i] = scanner.nextInt();
//			continue;
//		}
//		
//		System.out.print("Numbers:");
//		for (int i = 0; i < 10; i++) {
//			System.out.print(a[i] + ",");
//		}
		//System.out.print(a[9]);
	
