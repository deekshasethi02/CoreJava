package Interface;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee [] employee = new Employee[] {new tester("deeksha"),new programmer("aman"),new tester("ashish"),new programmer("aditi")};
		 /**
		  * when we have many types of employee but you only need those who are programmer
		  */
		 for(Employee employees : employee) {
			if(employees instanceof programmer)
				 employees.doSomething();
			
		 }
		 
		 
		}
}
