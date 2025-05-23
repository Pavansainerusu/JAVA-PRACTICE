package com.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class InputOputReader {

	public static void main(String[] args) {
		 String inputPath = "C:\\Users\\pavan\\Desktop\\sample.txt";
	        String outputPath = "C:\\Users\\pavan\\Desktop\\OutPut.txt";

	        try (
	            BufferedReader reader = new BufferedReader(new FileReader(inputPath));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));
	        ) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                writer.write("Read Line: " + line);
	                writer.newLine(); // Move to next line in output file
	            }
	            System.out.println("I/O operation completed successfully.");
	        } catch (IOException e) {
	            System.out.println("Error during file I/O: " + e.getMessage());
	        }

	}

}
