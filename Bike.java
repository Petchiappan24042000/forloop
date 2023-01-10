package com.java8static;

public interface Bike  {
	public default void printBrand() {
		System.out.println("Honda");
	}

}
