package com.yash.executor;

//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable {
//Lock lock = new ReentrantLock();
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
//		for(int i =1;i<=10;i++) {
//			lock.lock();
//			System.out.println(5*i);
//			lock.unlock();
//		}
	}

}
