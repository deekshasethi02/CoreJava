
public class PriorityDemo extends Thread {
	
	public void run() {
		for(int i =0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Sample1{
	public static void main(String[] args) {
		PriorityDemo p = new PriorityDemo();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}