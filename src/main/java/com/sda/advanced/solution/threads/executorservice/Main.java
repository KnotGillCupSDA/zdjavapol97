package com.sda.advanced.solution.threads.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutorService.scheduleAtFixedRate(Main::callHttpService, 1, 2, TimeUnit.SECONDS);


		Thread.sleep(5000);
		scheduledExecutorService.shutdown();
	}

	private static void callHttpService() {
		System.out.println("I've just performed an HTTP call");
	}

}
