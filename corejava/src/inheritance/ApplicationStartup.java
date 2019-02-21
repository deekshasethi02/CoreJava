package inheritance;

public class ApplicationStartup {

	public static void main(String[] args) {
				Animal animal= new Dog();
				animal.eat();
				animal.run();
				
				((Dog) animal).bark();
				

	}

}
