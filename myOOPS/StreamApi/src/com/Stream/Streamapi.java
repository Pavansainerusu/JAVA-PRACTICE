package com.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");

	        // Example 1: Filter names that start with 'A', convert to uppercase, remove duplicates
	        List<String> result = names.stream()
	            .filter(name -> name.startsWith("A"))
	            .map(String::toUpperCase)
	            .distinct()
	            .collect(Collectors.toList());

	        System.out.println("Filtered Names: " + result);

	        // Example 2: Count names with length > 3
	        long count = names.stream()
	            .filter(name -> name.length() > 3)
	            .count();

	        System.out.println("Names with length > 3: " + count);

	}

}
