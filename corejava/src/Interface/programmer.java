package Interface;

public class programmer implements Employee {
private String name;
	public programmer(String name) {
		this.name = name;
	}

	@Override
	public void doSomething() {
		System.out.println(name + " is programming");
		
	}

}
