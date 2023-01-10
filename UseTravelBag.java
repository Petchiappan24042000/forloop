package com.java8static;

public class UseTravelBag {
	public static void main(String[]args) {
		System.out.println(Bag.bagType());
		TravelBag T=new TravelBag();
		System.out.println(T.printColor());
		System.out.println(T.waterProof(true));
	}

}
