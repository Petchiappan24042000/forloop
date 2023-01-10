package com.java8static;

import java.util.Optional;
import java.util.OptionalLong;

public class Practice {
	public static void main(String[] args) {
		String word=null;
		Optional<String>check=Optional.ofNullable(word);
		if(check.isPresent()) {
			System.out.println(word.toUpperCase());
		}
		else {
			System.out.println("The string is null");
		}
		
	
	String b=null;
	Optional<String>check1=Optional.ofNullable(b);
	System.out.println(check1.orElse("The string is null"));
	}

}
