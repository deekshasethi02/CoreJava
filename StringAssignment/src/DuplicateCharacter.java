
public class DuplicateCharacter {
String word;

public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}
public String  findDuplicateCharacter() {
	 char var;
	 char ch = 0;
	 int max=0;
	 
	  
	    for (var = 'a'; var <= 'z'; var++) {
	    int count=0;    
	        for (int i = 0; i < word.length(); i++) {
	    
	        	if (word.charAt(i) == var) {
	                count++;
	            }
	        }
	        if(count>0 && count>max) {
	        	max= count;
	        	ch =var;
	        }
	       
	    }
	    System.out.print(ch+"="+max);
	    return ch+"="+max;           	
	     }
 
	     
}

