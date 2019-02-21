class Animal{
	
}
class Student{
	
}
class Employee extends Student{
	
}


public class TestArray {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.getClass());
		double arr[] = new double[10];
		arr[0] = 8;
		arr[1] = 'a';
		arr[2] = 97.5;
//		arr[3] = true;
//		System.out.println(arr[3]);
//	System.out.println(arr[2]);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		
//		System.out.println(arr.getClass().getTypeName());
//		System.out.println(arr.getClass());

		Student [] sts = new Student[5];
		sts[0] = new Employee();
	}

}
