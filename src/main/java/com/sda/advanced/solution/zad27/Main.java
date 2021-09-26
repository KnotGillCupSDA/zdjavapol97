package com.sda.advanced.solution.zad27;

public class Main {

	public static void main(String[] args) {
		final Joiner<String> joiner = new Joiner<>("+");
		final String join = joiner.join("a", "b", "c");

		final Joiner<Integer> intJoiner = new Joiner<>("+");
		intJoiner.join(1, 2, 3);
		System.out.println(join);

		final JoinerWithGenericMethod joiner2 = new JoinerWithGenericMethod("-");
		final String joinStrings = joiner2.join("a", "b", "c");
		System.out.println(joinStrings);
		final String joinInts = joiner2.join(1, 2, 3);
		System.out.println(joinInts);
	}
}
