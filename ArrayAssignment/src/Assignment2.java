
public class Assignment2 {
	
	int count=0;
	public int  Positive(int a[]) {
		for(int i = 0; i < 5; i++)
	     {
	         if(a[i] >= 0)
	         {
	            count++;
	         }
	     }
		System.out.println("There are " + count + " positive numbers in the array");
		return count;
		
	}
	
	
	public int Negative(int a[]) {
		for(int i = 0; i < 5; i++)
	     {
	         if(a[i] < 0)
	         {
	            count++;
	         }
	     }
		System.out.println("There are " + count + " negative numbers in the array");
		return count;
	}
	
	public int Even(int a[]) {
		for(int i = 0; i < 5; i++)
	     {
	         if(a[i]%2 == 0)
	         {
	            count++;
	         }
	     }
		System.out.println("There are " + count + " even numbers in the array");
		return count;
	}
	
	public int Odd(int a[]) {
		for(int i = 0; i < 5; i++)
	     {
	         if(a[i]%2 != 0)
	         {
	            count++;
	         }
	     }
		System.out.println("There are " + count + " odd numbers in the array");
		return count;
	}
}
