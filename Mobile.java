package com.java8static;

public class Mobile implements Electonics { 
	public void printBrand () {
		System.out.println("RealMe");
	
	}
	public static void onOff(boolean isOn) {
		if(isOn==true) {
			System.out.println("it isworking");
		}
		else {
			System.out.println("it is not working");
		}
	}
}
