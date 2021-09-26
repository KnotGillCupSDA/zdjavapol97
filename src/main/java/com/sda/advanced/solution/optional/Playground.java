package com.sda.advanced.solution.optional;

import java.util.Optional;

public class Playground {

	public static void main(String[] args) {

		Optional<String> a = getString();
		if(a.isPresent()) {
			a.get().substring(2);
		}

		Optional<String> o = Optional.ofNullable(null);
		System.out.println("Should be present? "+ o.isPresent());
		o.ifPresent(s -> System.out.println("coś jest: "+ s));

		Optional<String> o2 = Optional.of("akuku");
		o2.ifPresent(s -> System.out.println("coś jest: "+ s));



	}

	private static Optional<String> getString() {
		return Optional.empty();
	}

}
