package com.ait.in;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p= i -> i>10;
		boolean test = p.test(15);
		System.out.println(test);
	}

}
