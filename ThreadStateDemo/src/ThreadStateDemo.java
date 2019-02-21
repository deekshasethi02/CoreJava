
public class ThreadStateDemo extends Thread {
@Override
public void run() {

	System.out.println("Thread is in RUNNING state");
	try {
	System.out.println("Thread is in WAITING state");
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Thread is getting TERMINATED ");
}
}
