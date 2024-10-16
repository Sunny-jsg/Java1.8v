package com.ai.streams;

import java.util.Arrays;
import java.util.List;

public class MappingDemo1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("india", "japan", "usa", "uk");
		names.stream().map(name -> name.toUpperCase()).forEach(n -> System.out.println(n));
		names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));
	}

}
