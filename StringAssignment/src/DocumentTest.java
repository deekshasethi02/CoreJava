
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DocumentTest {
	@Test
	public void testShowDocumentInformation(){
		Document document= new Document();
		document.setTitle("core java basics");
		document.setFilepath("C:\\Users\\deeksha.sethi\\Desktop\\deeksha\\corejava");
		
		assertEquals("Document [title=core java basics, filepath=C:\\Users\\deeksha.sethi\\Desktop\\deeksha\\corejava]",document.showDocumentInformation());
	}
}
