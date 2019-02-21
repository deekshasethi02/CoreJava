import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SectionTest {
@Test
public void testShowSectionDetail() {
	Section section = new Section();
	section.setId(100);
	section.setName("Deeksha");
	section.setDate(2018,9,11);
	assertEquals(100,section.getId());
	assertEquals("Deeksha",section.getName());
	assertEquals("11-09-2018",section.getDate());
	//assertEquals("Section [id=100, name=Deeksha, date=11-09-2018]",section.showSectionDetail());
	
}
}
