package com.ai.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(14, 50, 65, 12, 32, 40, 20);
		/*Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(i -> i > 20);
		filter.forEach(i -> System.out.println(i));
           */
		list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));
	}

}
