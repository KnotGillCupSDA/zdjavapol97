package com.sda.advanced.solution.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> unsorted = List.of("c", "d", "z", "b", "j");

		/*List<String> unsorted = new ArrayList<>();
		unsorted.add("c");
		unsorted.add("d");
		unsorted.add("z");
		unsorted.add("b");
		unsorted.add("j");*/

		System.out.println("unsorted: "+ unsorted);
		System.out.println("============");
		System.out.println("sorted: " + getSortedAnonymous(unsorted));
		System.out.println("============");
		System.out.println("sorted: "+ getSortedMyImplementation(unsorted));
		System.out.println("============");
		System.out.println("sorted: "+ getSortedLambda(unsorted));
		System.out.println("============");
		System.out.println("sorted: "+ getSortedStream(unsorted));
		System.out.println("============");
		System.out.println("sorted: "+ getSortedList(unsorted));
	}

	private static List<String> getSortedAnonymous(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		//1 - inline/anonymous Comparator interface
		Collections.sort(sorted, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		return sorted;
	}

	private static List<String> getSortedMyImplementation(List<String> unsorted) {
		List<String> sorted = new ArrayList<>();
		sorted.addAll(unsorted);
		//2 - named Comparator interface implementation
		Collections.sort(sorted, new MyReverseStringComparator());
		return sorted;
	}

	private static List<String> getSortedLambda(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		//3 - lambda, since java 8
		Collections.sort(sorted, (o1, o2) -> -o1.compareTo(o2));
		return sorted;
	}

	private static List<String> getSortedStream(List<String> unsorted) {
		//4 - stream API, since java 8
		return unsorted.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
	}

	private static List<String> getSortedList(List<String> unsorted) {
		List<String> sorted = new ArrayList<>(unsorted);
		//5 - sort on list directly, since 11
		//sorted.sort((o1, o2) -> -o1.compareTo(o2));
		sorted.sort(Comparator.reverseOrder());
		return sorted;
	}

}
