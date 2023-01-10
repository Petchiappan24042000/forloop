package com.java8static;

public class Methods {
	public int findMax(int[] a) {
		int max=a[0];
		for(int i:a) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public static int findMin(int[] b) {
		int min=b[0];
		for(int i:b) {
			if(i<=min) {
				min=i;
			}
		}
		return min;
	}

}
