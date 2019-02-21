
public class Employee1 {

	private int id;
	private String name;
	double salary;
	
	public void setId(int id) {
		if(id<0) {
			throw new RuntimeException("Negative id is not allowed");
			
		}else {
			
		this.id=id;
	}
		
}

	public void setName(String name) {
		if(name.equals("unknown") || name.isEmpty()) {
		throw new RuntimeException("empty name or unknown is not allowed");
	}else {
		this.name = name;
	}
	}

	public void setSalary(double salary) {
		if(salary<0) {
			throw new RuntimeException("salary cannot be negative");
		}else {
			this.salary = salary;	
		}
		
	}
	@Override
	public String toString() {
	
		return super.toString();
	}
}