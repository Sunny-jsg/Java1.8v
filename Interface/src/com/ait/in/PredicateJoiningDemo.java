package com.ait.in;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String name;
	String location;
	String dept;

	Employee(String name, String location, String dept) {
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredicateJoiningDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("John", "Delhi", "Testing");
		Employee e2 = new Employee("Smith", "Pune", "DB");
		Employee e3 = new Employee("David", "Hyd", "DB");
		Employee e4 = new Employee("Karthik", "Banglore", "DevOps");
		Employee e5 = new Employee("Ritik", "Hyd", "Java");
		Employee e6 = new Employee("Varun", "Hyd", "DB");
		List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5, e6);
		Predicate<Employee> p1 = e -> e.location.equals("Hyd");
		Predicate<Employee> p2 = e -> e.dept.equals("DB");
		// joining two Predicate
		Predicate<Employee> p = p1.and(p2);
		for (Employee e : emps) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}
	}

}
