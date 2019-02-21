
public class MyRunnable implements  Runnable{

	@Override
	public void run() {
		for(int x =1;x<0;x++) {
			
			System.out.println("Runnable  " + Thread.currentThread().getName() + " x is " + x);
		}
		// TODO Auto-generated method stub
		
	}

}
