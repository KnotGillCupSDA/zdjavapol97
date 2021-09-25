package com.sda.advanced.solution.zad4_advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

	private final Map<String, List<String>> map;

	public Storage() {
		map = new HashMap<>();
	}

	void addToStorage(String key, String value) {
		if (map.containsKey(key)) {
			//if already contains the key, add another element to the list
			List<String> strings = map.get(key);
			strings.add(value);
		} else {
			//if does not contain the key, create new list with one element and put that into map
			List<String> strings = new ArrayList<>();
			strings.add(value);
			map.put(key, strings);
		}
	}

	void printValues(String key) {
		if (map.containsKey(key)) {
			System.out.println(map.get(key));
		} else {
			System.out.println("Nie znaleziono pozycji");
		}
	}

	List<String> findKeysByValue(String value) {

		/*List<String> foundKeys = new ArrayList<>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue().equals(value)) {
				foundKeys.add(entry.getKey());
			}
		}
		return foundKeys;*/

		return map.entrySet()
				.stream()
				.filter(entry -> entry.getValue().equals(value))
				.map(entry -> entry.getKey())
				.collect(Collectors.toList());
	}
}
