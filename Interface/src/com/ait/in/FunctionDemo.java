package com.ait.in;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = (name) -> name.length();
		Integer n = f.apply("Sunny");
		System.out.println(n);
		
	}
}
