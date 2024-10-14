package com.ait.in;

import java.util.function.Predicate;
//Declare names in Array and print names which are starting with 'A' using lambda expression.
public class PredicateDemo2 {
	public static void main(String[] args) {
		String names[] = { "Anushka", "Anupama", "Deepika", "Aarti", "Rakha", "Aaliya" };
		Predicate<String> p = name -> name.charAt(0) == 'A';
		for (String n : names) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
	}

}
