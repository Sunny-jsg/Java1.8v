package com.ai.streams;

import java.util.Arrays;
import java.util.List;

public class MappingDemo2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashok", "Anil", "Chandan", "Akash", "Raju", "Anushka");
		names.stream().filter(name -> name.startsWith("A"))
		.map(name -> name +"-"+ name.length())
				.forEach(name -> System.out.println(name));
	}

}
