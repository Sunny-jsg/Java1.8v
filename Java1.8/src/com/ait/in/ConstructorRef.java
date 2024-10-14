package com.ait.in;

import java.util.function.Supplier;

public class ConstructorRef {
	public static void main(String[] args) {
		Supplier<Doctor> d = Doctor::new;
		System.out.println(d.get().hashCode());
	}

}

class Doctor {
	Doctor() {
		System.out.println("Doctor constructor...");
	}
}