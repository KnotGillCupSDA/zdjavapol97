package com.sda.advanced.solution.zad2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = List.of("c", "d", "Z", "z", "B", "b", "j");

		System.out.println("unsorted: " + unsorted);
		System.out.println("============");
		System.out.println("sorted: " + getSortedCaseInsensitive(unsorted));
	}

	private static List<String> getSortedCaseInsensitive(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort((o1, o2) -> -o1.compareTo(o2));
		return sorted;
	}

}
