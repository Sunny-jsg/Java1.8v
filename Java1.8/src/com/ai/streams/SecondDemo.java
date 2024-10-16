package com.ai.streams;

import java.util.Arrays;
import java.util.List;

public class SecondDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("John","Anushka","Ram","Anupama","Raja","Ashok");
		names.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
	}

}
