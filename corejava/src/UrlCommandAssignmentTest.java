class UrlCommandAssignment{

	public String getCommand(String url) {
		
		int i=url.lastIndexOf('/');
	    int j=url.lastIndexOf('.');
	    String string=url.substring(i+1 , j);
		return string;
	}
}
	

public class UrlCommandAssignmentTest {

	public static void main(String[] args) {
		UrlCommandAssignment urlCommandAssignment = new UrlCommandAssignment();
		String url = "www.yash.com/admin/policy.htm";
		String command= urlCommandAssignment.getCommand(url) ;
		System.out.println("command is :" +command);
	}

}

