import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee [] employee = new Employee[10];
		//System.out.println("enter employee details");
			Scanner scanner = new Scanner(System.in);
		for(int i =0;i<3;i++)
		{
			employee[i] = new Employee();
			System.out.println("enter employee id:");
			employee[i].setEmployeeId(scanner.nextLine());
			System.out.println("enter employee name:");
			employee[i].setEmployeeName(scanner.nextLine());
		}
		
		for(int i =0; i<3;i++) {
			System.out.println("employee id:"+employee[i].getEmployeeId() + "   " + "employee name:"+employee[i].getEmployeeName());
			}
	}

}
