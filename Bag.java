package com.java8static;

public interface Bag {
	public static String bagType() {
		return "TravelBag";
	}
	public default String printColor() {
		return "Black";
	}

}
