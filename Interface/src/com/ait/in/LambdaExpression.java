package com.ait.in;

@FunctionalInterface
interface MyInterfaceOne {
	public void m1();
}

public class LambdaExpression {
	public static void main(String[] args) {
		MyInterfaceOne mto = () -> System.out.println("m1 method called..");
		mto.m1();
	}

}
