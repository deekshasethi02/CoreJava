package com.yash.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLock1 {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		ReentrantDemo rd1 = new ReentrantDemo(lock);
		ReentrantDemo rd2 = new ReentrantDemo(lock);
		rd1.setName("passenger 1");
		rd2.setName("passenger 2");

		rd1.start();
		rd2.start();
	}

}

class ReentrantDemo extends Thread {
	Lock lock;
int ticket =1;
	public ReentrantDemo(Lock lock2) {
		this.lock = lock;
	}

	@Override
	public void run() {
	if(ticket == 1) {
		lock.lock();
		System.out.println(Thread.currentThread().getName() + " : Ticket booked");
		lock.unlock();
	}
	}
}