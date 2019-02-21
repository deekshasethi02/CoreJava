import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class StringDemoTest {

	@Test
	public void testGetRequiredDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string:");
		String input= sc.nextLine();
		System.out.println("Input="+input);
		
		StringDemo sd= new StringDemo();
		String result = sd.getRequiredData(input);
				assertEquals(false,result.isEmpty());
	}
}
