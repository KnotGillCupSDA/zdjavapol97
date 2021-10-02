package com.sda.advanced.solution.threads;

import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("begin");

		//throwingMethod();

		Thread thread1 = new MyThread("thread1");
		thread1.start();
		System.out.println("not yet end");

		Thread thread2 = new Thread(new MyRunnable());
		thread2.start();

		Thread thread3 = new Thread(new MyRunnable());
		thread3.start();

		thread1.join();

		System.out.println("end");
		//Thread.sleep(10_000);
		//System.exit(0);
	}

	private static void throwingMethod() {
		throw new RuntimeException("dsad");
	}

	private static class MyThread extends Thread {

		public MyThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("akuku from " + this.getName());
				try {
					Thread.sleep(getRandomMillis());
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}
		}
	}

	static class MyRunnable implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("akuku from " + Thread.currentThread().getName());
				try {
					Thread.sleep(getRandomMillis());
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}
		}

	}

	private static int getRandomMillis() {
		return new Random().nextInt(2000) + 1000;
	}
}
