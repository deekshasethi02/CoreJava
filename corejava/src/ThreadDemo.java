
public class ThreadDemo extends Thread {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ", ");

			if (i % 10 == 0) {
				System.out.println(" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
}

class ThreadTest {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadDemo());
		thread1.start();
	}
}