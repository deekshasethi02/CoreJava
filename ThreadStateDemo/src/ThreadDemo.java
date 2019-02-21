
public class ThreadDemo {

	public static void main(String[] args) {
		
		Thread threadDemo =new Thread(new ThreadOne());
		System.out.println("NEW");
		threadDemo.start();
		System.out.println("RUNNABLE");
		
		
	}
	
	
}

class ThreadOne implements Runnable {
	
	@Override
	public void run() {
		System.out.println("RUNNING");
		
		try {
			System.out.println("TIMED_WAITING");
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("TERMINATED");
	}
}