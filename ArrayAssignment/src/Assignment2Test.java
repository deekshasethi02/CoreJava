import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assignment2Test {
	int a[]= {2,3,5,4,-9};
	Assignment2 a2= new Assignment2();
	
@Test
public void testPositive() {
	
	
	assertEquals(4,a2.Positive(a));
}

@Test
public void testNegative() {
	assertEquals(1,a2.Negative(a));
}
@Test
public void testEven() {
	assertEquals(2,a2.Even(a));
	
}
@Test
public void testOdd() {
assertEquals(3,a2.Odd(a));	
}
}
