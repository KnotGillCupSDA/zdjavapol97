package com.sda.advanced.solution.zad4;

public class Main {
	public static void main(String[] args) {
		Storage storage = new Storage();

		storage.addToStorage("Horstmann", "Java podstawy");
		//storage.addToStorage("Horstmann", "Java zaawansowana");
		storage.addToStorage("Nieznany", "Java rusz głową");
		storage.addToStorage("Bloch", "Essential Java");

		storage.printValues("Horstmann");
		storage.printValues("nieistniejący autor");

		System.out.println(storage.findKeysByValue("Java podstawy"));
	}
}
