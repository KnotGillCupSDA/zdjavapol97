package com.sda.advanced.solution.zad27;

public class Joiner<T> {

	private final String delimiter;

	public Joiner(String delimiter) {
		this.delimiter = delimiter;
	}

	public String join(T... parts) {
		StringBuilder builder = new StringBuilder();
		for (T part : parts) {
			builder.append(part.toString());
			builder.append(delimiter);
		}
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}

}
