package com.sda.advanced.solution.zad29;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		Collection<Integer> collection = List.of(1, 2, 4, 5, 7, 2, 9);
		Predicate<Integer> predicate = new GreaterThan3Predicate();
		CollectionConditionTester.partOf(collection, predicate);
		CollectionConditionTester.partOf(collection, i -> i > 3);
	}
}
