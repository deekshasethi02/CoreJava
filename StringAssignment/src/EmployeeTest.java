import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class EmployeeTest {
@Test
public void testGeneratePassword() {
	
	Employee emp = new Employee();
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter first name");
	String fname = sc.nextLine();
	emp.setFname(fname);
	System.out.println("Enter last name");
	String lname = sc.nextLine();
	emp.setLname(lname);
	System.out.println("Enter company name");
	String company = sc.nextLine();
emp.setCompany(company);
	System.out.println("Enter role");
	String role = sc.nextLine();
	emp.setRole(role);
	
	String result=emp.generatePassword();
	System.out.println(result);
	
	//if(result.isEmpty() == false) {
	assertEquals(false,result.isEmpty());
	//}else {
	//	System.out.print("password not generated");
	//}
}
}
