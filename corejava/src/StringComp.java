
public class StringComp {

	public static void main(String[] args) {
		String str1= "Hello";
		String str2="hello";
		
		if(str1 == str2) {
			System.out.println("both are equal");
		}
		if(str1.equals(str2)) {
			
			System.out.println("value are same");
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("both value are same but in different case");
		}
	}

}
