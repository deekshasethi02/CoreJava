
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("------Line first(main)------");

		method1();
		System.out.println("------line last(main)-------");
	}

	private static void method1() {
		System.out.println("----------Line first(method1)-------------");

		method2();
		System.out.println("----------Line last (method1)-------------");

	}

	private static void method2() {

		System.out.println("----------Line first(method2)-------------");
		int a = 10;
		int b = 0;
		try {
			int c = a / b;
			System.out.println("Result: " + c);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("----------Line last (method2)-------------");

	}

}
