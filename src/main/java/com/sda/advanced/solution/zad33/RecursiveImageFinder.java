package com.sda.advanced.solution.zad33;

import java.io.File;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class RecursiveImageFinder {

	public static List<Path> getAllImages(Path directory) {
		List<Path> allImages = new LinkedList<>();
		File[] files = directory.toFile().listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					allImages.addAll(getAllImages(file.toPath()));
				} else {
					if (file.getName().endsWith(".jpg") || file.getName().endsWith(".png")) {
						allImages.add(file.toPath());
					}
				}
			}
		}
		return allImages;
	}
}
