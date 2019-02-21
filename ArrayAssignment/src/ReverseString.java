import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("enter string:");
			String str = scanner.nextLine();
			System.out.println("Original string is:"+str);
			String reversed=reverseIt(str);
			System.out.println("Reversed String:"+reversed);
			
			
	}
	
	public static  String reverseIt(String str) {
	if(str.isEmpty()) {	
		return str;
	}
	else {
		return reverseIt(str.substring(1))+str.charAt(0);
	}

	}
	
}
