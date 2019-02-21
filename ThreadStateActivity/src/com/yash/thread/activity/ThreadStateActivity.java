package com.yash.thread.activity;

public class ThreadStateActivity {

	public static void main(String[] args) {
		new Thread(new Printer()).start();
		

	}

}

class Printer extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + ", ");

			if (i % 10 == 0) {
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
