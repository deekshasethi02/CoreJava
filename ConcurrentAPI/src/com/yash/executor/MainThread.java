package com.yash.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainThread {

	public static void main(String[] args) {
		Runnable command = new MyRunnable();
//		Executor ex = new ExecutorImpl();
//		for(int i = 0; i < 2  ; i++) {
//			
//			ex.execute(command);
//		}
//		Executor ex1 = Executors.newCachedThreadPool();
//		for (int i = 0; i < 4; i++) {
//			ex1.execute(command);
//		}
//		Executor ex2 = Executors.newFixedThreadPool(5);
//		for (int i = 0; i < 5; i++) {
//			ex2.execute(command);
//		}
		ThreadPoolExecutor ex3 = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			ex3.execute(command);
		}
		ex3.setMaximumPoolSize(8);
		for (int i = 0; i < ex3.getMaximumPoolSize(); i++) {
			ex3.execute(command);
		}
	}

}
