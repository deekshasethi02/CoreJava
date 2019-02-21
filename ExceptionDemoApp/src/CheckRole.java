
public class CheckRole {

	public static void main(String[] args) {
		System.out.println("----Line : first(main)----");

		String userrole = "manager";
		authenticationCheck(userrole);
		System.out.println("----Line : last(main)----");

	}

	private static void authenticationCheck(String userrole) {
		try {
			if (userrole.equals("admin")) {

				System.out.println("WELCOME : " + userrole);
			} else {

				// System.out.println("You are blocked");
				throw new RuntimeException("You are blocked!");
			}
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
