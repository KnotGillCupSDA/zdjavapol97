package com.sda.advanced.solution.zad25;

public class BasketDemo {

	public static void main(String[] args) {
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
		} catch (BasketEmptyException e) {
			System.out.println("Nie można usunąć: "+ e.getMessage());
		} catch (BasketFullException e) {
			System.out.println("Nie można dodać aż tyle: "+ e.getMessage());
		}

		System.out.println("Still working");

	}
}
