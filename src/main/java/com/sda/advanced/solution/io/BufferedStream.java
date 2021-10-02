package com.sda.advanced.solution.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {
	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		BufferedWriter out = null;

		try {
			in = new BufferedReader(new FileReader("src/main/resources/zad30/someTextFile.txt"));
			out = new BufferedWriter(new FileWriter("src/main/resources/zad30/output.txt"));

			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.newLine();
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}