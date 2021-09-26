package com.sda.advanced.solution.zad28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {

	public List<T> getEveryNthElement(int startIndex, int skip) {

		if (startIndex < 0 | startIndex >= size()) {
			return Collections.emptyList();
		}

		List<T> skipped = new ArrayList<>();

		for (int i = startIndex; i < size(); i += skip + 1) {
			skipped.add(get(i));
		}

		return skipped;
	}

	public List<T> getEveryNthElementWithWhile(int startIndex, int skip) {

		List<T> everyNthElement = new ArrayList<>();

		int currentIndex = startIndex;
		while (currentIndex < size()) {
			everyNthElement.add(get(currentIndex));
			currentIndex += skip + 1;
		}

		return everyNthElement;
	}
}
