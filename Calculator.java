package com.java8static;

public interface Calculator {
	public int math(int a,int b);
	public static void Operation() {
		System.out.println("File performs Calculation");
	}
	public default void print() {
		System.out.println("Add,Sub");
	}

}
