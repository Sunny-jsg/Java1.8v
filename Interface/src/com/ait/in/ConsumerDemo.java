package com.ait.in;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> s = (name) -> System.out.println(name + ", Good Morning..");
		s.accept("Sunny");
		s.accept("Saniya");
		s.accept("Radha");
		List<Integer> l = Arrays.asList(10, 20, 30, 40, 50, 60);
		l.forEach(i -> System.out.print(i));
	}

}
