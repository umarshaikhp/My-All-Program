package com.Lambda;

abstract class Simple {
	public Simple() {
		System.out.println("p cons");
	}
	void show() {
		System.out.println("parent method");
	}
}

public class AbstractaMethodCall extends Simple {
	void show() {
		System.out.println("child method");
	}
	public static void main(String[] args) {
		AbstractaMethodCall a = new AbstractaMethodCall();
		a.show();
	}
}
