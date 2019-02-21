class myThread extends Thread {

	public void run() {
		System.out.println("starting thread " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {

			System.out.println("running " + Thread.currentThread().getName()); // running state
		}
		System.out.println("----------sleeping-----------" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000); // sleep mode

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Terminated thread " + Thread.currentThread().getName());
	}
}

class sample3 {

	public static void main(String args[]) throws InterruptedException {

		myThread m = new myThread();

		Thread t1 = new Thread(m);
		System.out.println("----new thread ----" + t1.getName());// live object of Thread

		Thread t2 = new Thread(m);
		System.out.println("----new thread -----" + t2.getName());
		Thread t3 = new Thread(m);
		System.out.println("---- new thread -----" + t3.getName());
		t1.start(); // alive state
		
		t1.join(); // t1 will execute till end
		
		t2.start();
		
		t3.start();
		
	}
}