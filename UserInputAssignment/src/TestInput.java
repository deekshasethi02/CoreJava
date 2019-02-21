import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestInput {

	public static void main(String[] args) throws NumberFormatException, IOException {

		TestInput test = new TestInput();
		 test.inputScanner();
		 test.inputBufferedReader();
		 test.inputCommandLine(args);
		test.inputJOptionPane();
	}

	public void inputScanner() {
		Employee employee = new Employee();
		System.out.println("----Scanner input method----");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee ID");
		int employeeId = scanner.nextInt();
		System.out.println("Enter employee name");
		String employeeName = scanner.next();
		System.out.println("Enter employee salary");
		int employeeSalary = scanner.nextInt();

		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setEmployeeSalary(employeeSalary);

		System.out.println("Employee ID: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Employee Salary: " + employee.getEmployeeSalary());
	}

	public void inputBufferedReader() throws NumberFormatException, IOException {
		Employee employee = new Employee();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---- Buffered reader method----");
		employee.setEmployeeId(Integer.parseInt(reader.readLine()));
		System.out.println("employee id: " + employee.getEmployeeId());

		employee.setEmployeeName(reader.readLine());
		System.out.println("employee name: " + employee.getEmployeeName());

		employee.setEmployeeSalary(Integer.parseInt(reader.readLine()));
		System.out.println("employee salary: " + employee.getEmployeeSalary());

	}

	public void inputCommandLine(String args[]) {
		Employee employee = new Employee();
		System.out.println("---command line method---");
		employee.setEmployeeId(Integer.parseInt(args[0]));
		System.out.println("enter employee Id:" + employee.getEmployeeId());

		employee.setEmployeeName(args[1]);
		System.out.println("enter employee name:" + employee.getEmployeeName());

		employee.setEmployeeSalary(Integer.parseInt(args[2]));
		System.out.println("enter employee salary:" + employee.getEmployeeSalary());

	}

	public void inputJOptionPane() {
		Employee employee = new Employee();
		System.out.println("---Joption pane method---");

		int employeeId = Integer.parseInt(JOptionPane.showInputDialog("enter employee id"));
		employee.setEmployeeId(employeeId);
		System.out.println("Employee ID:" + employee.getEmployeeId());

		String employeeName = JOptionPane.showInputDialog("enter employee name");
		employee.setEmployeeName(employeeName);
		System.out.println("Employee name:" + employee.getEmployeeName());

		int employeeSalary = Integer.parseInt(JOptionPane.showInputDialog("enter employee salary"));
		employee.setEmployeeSalary(employeeSalary);
		System.out.println("Employee salary:" + employee.getEmployeeSalary());

	}

}
