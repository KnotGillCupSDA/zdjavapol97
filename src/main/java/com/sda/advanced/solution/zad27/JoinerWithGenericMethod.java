package com.sda.advanced.solution.zad27;

public class JoinerWithGenericMethod {
	private final String delimiter;

	public JoinerWithGenericMethod(String delimiter) {
		this.delimiter = delimiter;
	}

	public <T> String join(T... parts) {
		StringBuilder builder = new StringBuilder();
		for (T part : parts) {
			builder.append(part.toString());
			builder.append(delimiter);
		}
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}

}
