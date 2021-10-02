package com.sda.advanced.solution.threads.synchronization;

public class NotSynchronized {

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

		private Integer left;
		private Integer right;

		public Pair(final Integer left, final Integer right) {
			this.left = left;
			this.right = right;
		}

		public void incrementLeft() {
			left++;
		}

		public void incrementRight() {
			right++;
		}

		public Integer getLeft() {
			return left;
		}

		public Integer getRight() {
			return right;
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