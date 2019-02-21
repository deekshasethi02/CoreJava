
public class Number {
	public static void main(String [] args) {
	
		int a[]={1,2,3,4,5,6,-7,-8,9,10};

		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
	
		for(int i = 0; i <10; i++)
	     {
	         if(a[i] >= 0)
	         {
	            count1++;
	         }
	     }
		System.out.println("There are " + count1 + " positive numbers in the array");
		//return count;
		
		for(int i = 0; i <10 ; i++)
	     {
	         if(a[i]<0)
	         {
	            count2++;
	         }
	     }
		System.out.println("There are " + count2 + " negative numbers in the array");
		//return count;
	
	
			for(int i = 0; i < 10; i++)
	     {
	         if(a[i]%2 == 0)
	         {
	            count3++;
	         }
	     }
		System.out.println("There are " + count3 + " even numbers in the array");
		//return count;
	
	
		for(int i = 0; i < 10; i++)
	     {
	         if(a[i]%2 != 0)
	         {
	            count4++;
	         }
	     }
		System.out.println("There are " + count4 + " odd numbers in the array");
		//return count;
	}


	

}