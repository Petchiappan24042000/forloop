package com.java8static;

public class UseCaculator {
	public static void main(String[]args) {
		Calculator add=(a,b)->a+b;
		Calculator sub=(a,b)->a-b;
		Calculator mul=(a,b)->a*b;
		
		System.out.println(add.math(20, 10));
		System.out.println(sub.math(20, 10));
		System.out.println(mul.math(20, 10));
		Calculator.Operation();
		
		mul.print();
	}
	

}
