package com.ai.streams;

import java.util.Arrays;
import java.util.List;

public class SlicingOperations {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("Raja", "Rani", "Raju", "Rani", "John", "Raju", "Raja");
		name.stream().limit(5).forEach(names -> System.out.println(names));
		System.out.println("=================================");
		name.stream().skip(3).forEach(names -> System.out.println(names));
		System.out.println("=================================");
		name.stream().distinct().forEach(names -> System.out.println(names));

	}

}
