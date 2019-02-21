import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateCharacterTest {

	 @Test
	 public void testDupicateCharacter(){
		 DuplicateCharacter duplicatecharacter = new DuplicateCharacter();
		 duplicatecharacter.setWord("java");
		
		 assertEquals("a=2",duplicatecharacter.findDuplicateCharacter());
	 }
}
