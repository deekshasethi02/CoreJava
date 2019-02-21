
public class NumberOccurance {

	public int calculateNumberOfOccurances(int a[],int x ){
		
		int count =0;
		for(int i = 0; i < 10; i++)
	     {
	         if(x == a[i])
	         {
	            count++;
	         }
	     }
	    System.out.println("Number of occurances of " + x + " is:" +count);
	     return count;
	}
}
