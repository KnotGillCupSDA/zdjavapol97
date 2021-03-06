package com.sda.advanced.solution.zad30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String directory = "src/main/resources/zad30/";
		String filename = "someTextFile.txt";

		String reversedFilename = reverse(filename);
		reverseContent(directory + filename, directory + reversedFilename);

	}

	private static void reverseContent(String inputFile, String outputFile) throws IOException {

		try (BufferedReader in = new BufferedReader(new FileReader(inputFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {

			String line;
			while ((line = in.readLine()) != null) {
				out.write(reverse(line));
				out.newLine();
			}
		}
	}

	private static String reverse(String filename) {
		return new StringBuilder(filename).reverse().toString();
	}

}
