package com.yash.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue1 {

	public static void main(String[] args) throws InterruptedException {
		//BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
		queue.add("deeksha");
		queue.add("ruchi");
		
		
		
		
		
		// queue.add("ashish");
		// queue.put("deeksha");
		// System.out.println(queue.offer("deeksha"));
		// System.out.println(queue);
		// System.out.println(queue.offer("aditi"));
		// queue.take();
		// queue.put("sethi");
		// queue.add("arju");
		// System.out.println( queue);
		
		
		
	}

}
