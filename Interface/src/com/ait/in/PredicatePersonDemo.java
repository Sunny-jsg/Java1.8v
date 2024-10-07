package com.ait.in;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

}

public class PredicatePersonDemo {

	public static void main(String[] args) {
		Person p0 = new Person("Ram", 20);
		Person p1 = new Person("Sonu", 15);
		Person p2 = new Person("Raju", 22);
		Person p3 = new Person("sunny", 21);
		Person p4 = new Person("Rani", 18);
		Person p5 = new Person("Manish", 12);
		List<Person> person = Arrays.asList(p0, p1, p2, p3, p4, p5);
		Predicate<Person> predicate = p -> p.age >= 18;
		for (Person p : person) {
			if (predicate.test(p)) {
				System.out.println(p.name);
			}

		}
	}
}
