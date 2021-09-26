package com.sda.advanced.solution.optional;

import java.util.Optional;

public class CreatingOptionals {
	public static void main(String[] args) {
		final Optional<String> stringOptional = Optional.of("This is SDA!"); // stworzenie pudełka z obiektem typu String

		String value = null;
		if ((Integer.parseInt(args[0]) % 2 == 0)) {
			value = "I am even";
		}
		final Optional<String> optionalThatCanBeEmpty = Optional.ofNullable(value); // wykorzystanie metody ofNullable, ponieważ value może być nullem. W takim przypadku Optional będzie pustym pudełkiem
	}
}
