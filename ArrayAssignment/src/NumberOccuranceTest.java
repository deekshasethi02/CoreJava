import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class NumberOccuranceTest {
	@Test
	public void testNumberOfOccurances() {
		int x=0,i=0;
		int a[]= new int[10];
		NumberOccurance assignment = new NumberOccurance();
		//assignment.calculateNumberOfOccurances(a,x);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		for(i = 0; i < 10; i++)
	    {
	        a[i] = sc.nextInt();
	    }
		System.out.println("Enter number to be checked");

		 x = sc.nextInt();
		 
		assertEquals(2,assignment.calculateNumberOfOccurances(a,x));
	}
}
