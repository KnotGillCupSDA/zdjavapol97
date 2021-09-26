package com.sda.advanced.solution.optional;

import java.util.Optional;

public class OptionalsPresenceExample {
	public static void main(String[] args) {
		final Optional<String> optional = getStringForEvenNumber(3);
		if (optional.isPresent()) {
			System.out.println("I am optional with a value, I am non empty box");
		} else if (optional.isEmpty()) { // warunek zawsze prawdziwy w tym momencie
			System.out.println("I am an empty optional");
		}

		optional.ifPresent(System.out::println); // wypisanie wartości w pudełku na ekranie, tylko jeżeli jest dostępna
	}

	private static Optional<String> getStringForEvenNumber(final int number) {
		if (number % 2 == 0) {
			return Optional.of("even");
		}
		return Optional.empty();
	}
}
