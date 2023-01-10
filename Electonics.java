package com.java8static;

public interface Electonics {
	public static void onOff(boolean isOn) {
		if(isOn==true) {
			System.out.println("Working");
		}
		else {
			System.out.println("not working");
		}
	}
 
}
