
public class ReverseArray {

	public static void main(String[] args) {
		
	       int[] arr1={1,2,3,4,5,6,7,8,9,10};
	       int[] arr2;

	       arr2=new int[arr1.length];

	       System.out.println(" The contents of the Array-1 (original order) are :");

	       for(int i=0;i<arr1.length;i++)
	          System.out.print(" " + arr1[i]);

	       for(int j=0,k=9;j<arr1.length;j++,k--)
	          arr2[j]=arr1[k];

	       System.out.println("\n The contents of the Array-2 (reverse order) are :");

	       for(int l=0;l<arr2.length;l++)
	          System.out.print(" " + arr2[l]);
	    }

	}


