import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		int i, j;
		//System.out.println("Enter total rows and columns: ");
		Scanner s = new Scanner(System.in);
		//int row = s.nextInt();
		//int column = s.nextInt();
		int array[][] = new int[4][4];
		System.out.println("Enter matrix:");
	 	for(i = 0; i < 4; i++)
	  	{
	   	    for(j = 0; j < 4; j++) 
	     	    {
	        	array[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}
		System.out.println("The above matrix before Transpose is ");
	  	for(i = 0; i < 4; i++)
	    	{
	      	    for(j = 0; j < 4; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	 	System.out.println("The above matrix after Transpose is ");
	  	for(i = 0; i < 4; i++)
	    	{
	      	    for(j = 0; j < 4; j++)
	            {
	                System.out.print(array[j][i]+" ");
	            }
	            System.out.println(" ");
	        }
	    }
	}


