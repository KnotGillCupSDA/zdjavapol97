package com.sda.advanced.solution.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class MainNio {

	public static void main(String[] args) throws IOException {

		Path rootDir = Path.of("src", "main", "resources", "zad30");
		String filename = "someTextFile.txt";

		String reversedFilename = reverse(filename);

		reverseContent(rootDir.resolve(filename), rootDir.resolve(reversedFilename));

	}

	private static void reverseContent(Path inputFile, Path outputFile) throws IOException {

		List<String> reversedLines = Files.readAllLines(inputFile)
				.stream()
				.map(MainNio::reverse)
				.collect(Collectors.toList());

		Files.write(outputFile, reversedLines);

	}

	private static String reverse(String filename) {
		return new StringBuilder(filename).reverse().toString();
	}

}
