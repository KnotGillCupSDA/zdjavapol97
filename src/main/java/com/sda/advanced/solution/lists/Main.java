package com.sda.advanced.solution.lists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		strings.add("1");
		strings.add("2");
		strings.add("3");
		strings.add(null);
		strings.add("5");

		strings.remove(2);


		String[] stringsArray = new String[10];
		for (String i : stringsArray) {
			System.out.println(i);
		}

		for (int i = 0; i < stringsArray.length; i++) {
			System.out.println("Element " + i + "= " + stringsArray[i]);
		}



	}

}
