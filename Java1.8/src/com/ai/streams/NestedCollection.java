package com.ai.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NestedCollection {
	public static void main(String[] args) {
		List<String> javacourse = Arrays.asList("core java", "adv java", "springboot");
		List<String> uicourse = Arrays.asList("html", "css", "bs", "js");
		List<List<String>> course = Arrays.asList(javacourse, uicourse);
		// course.stream().forEach(c -> System.out.println(c));
		Stream<String> flatMap = course.stream().flatMap(s -> s.stream());
		flatMap.forEach(c -> System.out.println(c));
	}

}
