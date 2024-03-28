package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class StremAPIMain {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("test");
		names.add("pritesh");
		names.add("akash");
		names.add("arjun");

		List<Integer> number = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 10);

		number.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(n -> System.out.println("Numbers are : " + n));

		int total = number.stream().filter(x -> x % 2 == 0).reduce(0, (sum, i) -> sum + 1);
		System.out.println(total);
		// System.out.println(names.stream().filter(name ->
		// name.startsWith("a")).collect(Collectors.toList()));

		BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println(a + b);
		addition.accept(10, 20);

//		Comparator<String> compair = (s1,s2) -> str.compareTo(str);
//		compair.accept("hello");

		FunctionalInterfaceDemo custom = Test::printMethod;
		custom.displayMesage();
	}

}

class Test {
	public static void printMethod() {
		System.out.println("Print Method is Called");
	}
}
