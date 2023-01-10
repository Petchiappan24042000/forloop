package com.java8static;

public class UseMaxMin {
	public static void main(String[]args) {
		Methods m=new Methods();
		MaxMin maxi =m::findMax;
		MaxMin mini=Methods::findMin;
		int[] nums= {38,48,39,34,54};
		System.out.println(maxi.find(nums));
		System.out.println(mini.find(nums));
		
	}
 	

}
