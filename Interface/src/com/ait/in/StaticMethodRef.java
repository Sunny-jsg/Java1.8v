package com.ait.in;

@FunctionalInterface
interface Myinterface {
	public void m1();
}

public class StaticMethodRef {
	public static void m2() {
		System.out.println("m2 method...");
	}

	public static void main(String[] args) {
		Myinterface mi = StaticMethodRef::m2;
		mi.m1();
	}

}
