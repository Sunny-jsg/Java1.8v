package com.ait.in;

import java.util.function.BiFunction;

public class SumOfTwoInput {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bif = (i, j) -> i + j;
		Integer sum = bif.apply(19, 11);
		System.out.println(sum);
	}

}
