package com.sda.advanced.solution.zad25;

public class BasketFinallyDemo {

	public static void main(String[] args) throws BasketFullException, BasketEmptyException {
		final Basket basket = new Basket();

		try {
			basket.addToBasket();
			System.out.println("1");
			basket.removeFromBasket();
			System.out.println("2");
			basket.removeFromBasket();
			System.out.println("3");
			basket.removeFromBasket();
			System.out.println("4");
			basket.removeFromBasket();
			System.out.println("5");
		} finally {
			System.out.println("Cleaning up");
		}

		System.out.println("Still running?");
	}
}
