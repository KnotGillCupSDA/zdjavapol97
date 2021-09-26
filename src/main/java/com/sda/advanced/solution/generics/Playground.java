package com.sda.advanced.solution.generics;

import java.util.ArrayList;
import java.util.List;

public class Playground {

	public static void main(String[] args) {

		//w starej javie nie było generyków
		List strings = new ArrayList();

		//Możemy zapakować cokolwiek
		strings.add(1);
		strings.add("123456789");

		//na etapie kompilacji nie wykryjemy błędu
		String o = (String) strings.get(0);
		System.out.println(o.substring(2));
	}

}
