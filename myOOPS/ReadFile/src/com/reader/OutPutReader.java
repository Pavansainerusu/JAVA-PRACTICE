package com.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutPutReader {

	public static void main(String[] args) {
		  String outputPath = "C:\\Users\\pavan\\Desktop\\OutPut.txt";

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
	            writer.write("This is a test message.");
	            writer.newLine(); // For a new line
	            writer.write("Writing to a file using BufferedWriter in Java.");
	            writer.newLine(); // For a new line
	            writer.write("Writing to a file");
	            System.out.println("File writing completed.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }

	}

}
