package com.sda.advanced.solution.zad33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileWalkingImageFinder {

	public static List<Path> getAllImages(Path rootDir) throws IOException {
		try (Stream<Path> walk = Files.walk(rootDir)) {
			return walk
					.filter(path -> path.toFile().getName().endsWith(".jpg") || path.toFile().getName().endsWith(".png"))
					.collect(Collectors.toList());
		}
	}
}
