package com.Lambda;

interface Shalimar{
	String show(String name);
}

public class LambdaExpressionStringParameter {

	public static void main(String[] args) {
		Shalimar l = (name) -> {
			return "Hello " + name;

		};
		System.out.println(l.show("Aamir khan"));
		Shalimar l1 = (name) -> {
			return "Hello " + name;
		};
		System.out.println(l1.show("Aasim Khan"));
	}
}
