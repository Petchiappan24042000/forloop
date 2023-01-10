package com.java8static;

public class TravelBag implements Bag{
	public String printColor() {
		return "White";
	}
	public String waterProof(boolean isWater) {
		if(isWater==true) {
			return "Bag is WaterProof";
		}
		else {
			return "Bag is not WaterProof";
		}
	}

}
