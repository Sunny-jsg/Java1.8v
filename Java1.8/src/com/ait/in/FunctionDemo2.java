package com.ait.in;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student {
	int id;
	String name;
	String branch;

	Student(int id, String namr, String branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;

	}
}

public class FunctionDemo2 {
	public static void main(String[] args) {
		Student s1 = new Student(101,"Rohit","CSE");
		Student s2 = new Student(102,"Prince","EC");
		Student s3 = new Student(103,"Anurag","Civil");
		Student s4 = new Student(104,"Raju","ME");
		Student s5 = new Student(105,"Radha","CSE");
		Student s6 = new Student(106,"Sunny","EC");
		List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);
		//Function<Integer, Student> f = id -> 
	}

}
