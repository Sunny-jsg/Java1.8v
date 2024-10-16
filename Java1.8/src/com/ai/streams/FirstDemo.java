package com.ai.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstDemo {
	public static void main(String[] args) {
		//Approach -1
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
		ArrayList<String> names = new ArrayList<>();
		names.add("Raja");
		names.add("Rani");
		names.add("Ashok");
		//Approach -2
		Stream<String> stream2 = names.stream();
	}

}
