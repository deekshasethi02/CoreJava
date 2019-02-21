package com.yash.executor;

import java.util.concurrent.Executor;

public class ExecutorImpl implements Executor {

	@Override
	public void execute(Runnable command) {
		Thread thread = new Thread(command);
		thread.start();
	}

}
