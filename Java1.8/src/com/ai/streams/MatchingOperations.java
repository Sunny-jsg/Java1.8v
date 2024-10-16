package com.ai.streams;

import java.util.Arrays;
import java.util.List;

public class MatchingOperations {
	public static void main(String[] args) {
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "JAPAN");
		Person p3 = new Person("Sunny", "INDIA");
		Person p4 = new Person("Ching", "CHINA");
		List<Person> persons = Arrays.asList(p1, p2, p3, p4);
		boolean status1 = persons.stream().anyMatch(p -> p.Country.equals("INDIA"));
		System.out.println("Any Indian Available ? ::" + status1);
		boolean status2 = persons.stream().anyMatch(p -> p.Country.equals("CANADA"));
		System.out.println("Any Canadian Available ? ::" + status2);
		boolean status3 = persons.stream().allMatch(p -> p.Country.equals("INDIA"));
		System.out.println("All Persons from india ? ::" + status3);
		boolean status4 = persons.stream().noneMatch(p -> p.Country.equals("MEXICO"));
		System.out.println("No persons from mexico ? ::" + status4);

	}

}

class Person {
	String name;
	String Country;

	public Person(String name, String country) {

		this.name = name;
		this.Country = country;
	}

}