
public class ThreadState {

	public static void main(String[] args) {

		ThreadStateDemo threadstatedemo = new ThreadStateDemo();
		
		System.out.println("Thread is in NEW state");
		threadstatedemo.start();
		System.out.println("Thread is in RUNNABLE state");
	}

}
