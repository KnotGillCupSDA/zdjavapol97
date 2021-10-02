package com.sda.advanced.solution.zad37;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			executorService.execute(new ThreadPlaygroundRunnable("Kasia-" + i));
		}
		System.out.println("All tasks submit for execution");

		executorService.shutdown();

	}

}
