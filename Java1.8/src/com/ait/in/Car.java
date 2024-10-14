package com.ait.in;

interface Vehicle {
	public void start();

	public default void clean() {
		System.out.println("clean method...");
	}

	public static void run() {
		System.out.println("Run the car...");
	}

}

public class Car implements Vehicle {

	public void start() {
		System.out.println("car started...");

	}

	public void clean() {
		System.out.println("my clean method ...");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.clean();
		c.start();
		Vehicle.run();
	}

}
/*Interface can have concrete methods from java1.8v.
Interface concrete method should be default or static.
Interface defaults methods we can override in impl classes.
Interface static method we can't override in impl classes.
We can write multiple static and default method in interface.
default and static method introduced to provide backward compatability.*/

