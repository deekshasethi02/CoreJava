import static org.junit.Assert.assertEquals;



import org.junit.Test;

public class NumberToStringTest {
@Test
public void testNumberOutputInString() {
	
	NumberToString nt = new NumberToString();
	nt.setNum(2356.6);
	int count = nt.numberOutputInString();
	assertEquals(4,count);
			
}
}
