
public class Test {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		Thread t1 = new Thread(r);
		
		t.setName("deeskah");
		t1.setName("sethi");
		t.start();
		t1.start();
		
		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		t1.setName("deeksha");
//		t2.setName("sethi");
//		
//		t1.start();
//		t2.start();
//System.out.println(Thread.currentThread().getName());
//t1.stop();
	}

}
