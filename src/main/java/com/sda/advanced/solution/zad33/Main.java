package com.sda.advanced.solution.zad33;

import java.io.IOException;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) throws IOException {
		Path rootDir = Path.of("src", "main", "resources", "zad33");

		System.out.println(RecursiveImageFinder.getAllImages(rootDir));
		System.out.println(FileWalkingImageFinder.getAllImages(rootDir));

	}

}
