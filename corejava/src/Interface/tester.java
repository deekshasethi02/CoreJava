package Interface;

public class tester implements Employee {
	private String name;
	public tester(String name) {
		this.name = name;
	}

	@Override
	public void doSomething() {
		
		System.out.println(name+"  is testing");
	}

	
}
