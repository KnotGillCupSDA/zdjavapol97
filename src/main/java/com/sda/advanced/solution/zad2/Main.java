package com.sda.advanced.solution.zad2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = List.of("c", "d", "Z", "z", "B", "b", "j");

		System.out.println("unsorted: " + unsorted);
		System.out.println("============");
		System.out.println("sorted: " + getSortedCaseInsensitive(unsorted));
		System.out.println("sorted: " + getSortedCaseInsensitiveWithoutNewStrings(unsorted));
	}

	private static List<String> getSortedCaseInsensitive(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		sorted.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				//we allocate memory to create new strings
				String lowerCaseO1 = o1.toLowerCase();
				System.out.println(lowerCaseO1);
				String lowerCaseO2 = o2.toLowerCase();
				System.out.println(lowerCaseO2);

				return -lowerCaseO1.compareTo(lowerCaseO2);
			}
		});
		return sorted;
	}

	private static List<String> getSortedCaseInsensitiveWithoutNewStrings(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		//sorted.sort((o1, o2) -> -o1.compareToIgnoreCase(o2));
		sorted.sort(String.CASE_INSENSITIVE_ORDER.reversed());
		return sorted;
	}

}
