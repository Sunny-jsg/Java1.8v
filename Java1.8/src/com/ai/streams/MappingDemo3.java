package com.ai.streams;

import java.util.stream.Stream;

public class MappingDemo3 {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Rajesh", 22, 40000.00);
		Employee emp2 = new Employee("Ayush", 21, 90000.00);
		Employee emp3 = new Employee("Aditya", 20, 80000.00);
		Employee emp4 = new Employee("Rohit", 32, 120000.00);
		Employee emp5 = new Employee("Rajiv", 22, 45000.00);
		Employee emp6 = new Employee("Sunny", 23, 100000.00);
		Employee emp7 = new Employee("Golu", 28, 35000.00);
		Employee emp8 = new Employee("Vishal", 18, 60000.00);
		Employee emp9 = new Employee("Raju", 21, 48000.00);
		Stream<Employee> emp = Stream.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9);
		emp.filter(s -> s.salary >= 50000.00).map(n -> n.name + "-" + n.age).forEach(i -> System.out.println(i));

	}
}

class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}