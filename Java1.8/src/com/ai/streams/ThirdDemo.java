package com.ai.streams;

import java.util.stream.Stream;

public class ThirdDemo {
	public static void main(String[] args) {
		User u1 = new User("Anushka", 30);
		User u2 = new User("Shayam", 25);
		User u3 = new User("Mohan", 10);
		User u4 = new User("Raju", 10);
		User u5 = new User("Rani", 12);
		User u6 = new User("Ashok", 18);
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		//stream.filter(u -> u.age >= 18 ).forEach(u -> System.out.println(u));
		stream.filter(u -> u.age >=18 && u.name.startsWith("A"))
		.forEach(u -> System.out.println(u));

	}

}

class User {
	String name;
	int age;

	User(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}