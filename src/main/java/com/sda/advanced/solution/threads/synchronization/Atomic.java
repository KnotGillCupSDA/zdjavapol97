package com.sda.advanced.solution.threads.synchronization;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

	public static void main(String[] args) throws InterruptedException {
		final Pair pair = new Pair(0, 0);
		Thread t1 = new Thread(new DummyPairIncrementer(pair));
		t1.start();
		Thread t2 = new Thread(new DummyPairIncrementer(pair));
		t2.start();

		t1.join();
		t2.join();

		System.out.println(pair.getLeft() + " " + pair.getRight());
	}

	static class Pair {

		private final AtomicInteger left;
		private final AtomicInteger right;

		public Pair(final Integer left, final Integer right) {
			this.left = new AtomicInteger(left);
			this.right = new AtomicInteger(right);
		}

		public void incrementLeft() {
			left.incrementAndGet();
		}

		public void incrementRight() {
			right.incrementAndGet();
		}

		public Integer getLeft() {
			return left.get();
		}

		public Integer getRight() {
			return right.get();
		}
	}

	static class DummyPairIncrementer implements Runnable {

		private final Pair pair;

		public DummyPairIncrementer(final Pair pair) {
			this.pair = pair;
		}

		@Override
		public void run() {
			for (int idx = 0; idx < 1000; idx++) {
				pair.incrementLeft();
				pair.incrementRight();
			}
			System.out.println(pair.getLeft() + " " + pair.getRight());
		}
	}

}
