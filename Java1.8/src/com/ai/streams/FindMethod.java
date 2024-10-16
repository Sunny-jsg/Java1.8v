package com.ai.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindMethod {
	public static void main(String[] args) {
		Person1 p1 = new Person1("John", "USA");
		Person1 p2 = new Person1("Steve", "JAPAN");
		Person1 p3 = new Person1("Sunny", "INDIA");
		Person1 p4 = new Person1("Ching", "CHINA");
		Person1 p5 = new Person1("Ashok","INDIA");
		List<Person1> persons = Arrays.asList(p1, p2, p3, p4,p5);
		Optional<Person1> first = persons.stream().filter(p -> p.Country.equals("INDIA")).findFirst();
		if (first.isPresent()) {
			System.out.println(first.get());
		}
		System.out.println("----------------------");
		List<Person1> indian = persons.stream().filter(p -> p.Country.equals("INDIA"))
		.collect(Collectors.toList());
		System.out.println(indian.size());
		indian.forEach(i -> System.out.println(i));
		System.out.println("-------------------------");
		List<String> name = persons.stream().filter(p -> p.Country.equals("INDIA")).map(p -> p.name)
		.collect(Collectors.toList());
		name.forEach(n -> System.out.println(n));
	}

}

class Person1 {
	String name;
	String Country;

	public Person1(String name, String country) {

		this.name = name;
		this.Country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", Country=" + Country + "]";
	}

}