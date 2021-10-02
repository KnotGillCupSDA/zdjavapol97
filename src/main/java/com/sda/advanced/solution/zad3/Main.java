package com.sda.advanced.solution.zad3;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//oldschool
		/*Map<String, Integer> map = new HashMap<>();
		map.put("Java", 18);
		map.put("C#", 9);
		map.put("Python", 1);
		map.put("JavaScript", 0);
		map.put("PHP", 0);*/

		//java 11 style - immutable map
		Map<String, Integer> map = Map.of("Java", 18,
				"C#", 9,
				"Python", 1,
				"JavaScript", 0,
				"PHP", 0);

		print(map);
		System.out.println("========");
		printWithEntrySet(map);
	}

	private static void print(Map<String, Integer> map) {
		int i = 0;
		for (String key : map.keySet()) {
			Integer value = map.get(key);
			i++; //i = i + 1

			boolean isLastLoop = i == map.size();
			if (isLastLoop) {
				System.out.println("Klucz: " + key + ", Wartość: " + value + ".");
			} else {
				System.out.println("Klucz: " + key + ", Wartość: " + value + ",");
			}
		}
	}

	private static void printWithEntrySet(Map<String, Integer> map) {
		int i = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			i++; //i = i + 1

			boolean isLastLoop = i == map.size();
			if(isLastLoop) {
				System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ".");
			} else {
				System.out.println("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue() + ",");
			}
		}
	}

	private static void printWithStream(Map<String, Integer> map) {
		final String collect = map.entrySet().stream()
				.map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
				.collect(Collectors.joining("," + System.lineSeparator(), "", "."));

		System.out.println(collect);
	}

}
