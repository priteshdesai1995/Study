package com.test;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void displayMesage();

	default void function1() {
		System.out.println("Function 1 Called");
	}

	default void function2() {
		System.out.println("Function 2 Called");
	}
}
