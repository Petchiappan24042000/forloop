package com.java8static;

public class UseStringMethods {
	public static void main(String[]args) {
		StringMethods sm1=(a)->System.out.println(a.length());
		StringMethods sm2=(a)->System.out.println(a.toUpperCase());
		StringMethods sm3=(a)->System.out.println(a.toLowerCase());
		StringMethods sm4=a->{
			if(a.contains("a")||a.contains("i")||a.contains("o")||a.contains("u")||a.contains("e")) {
				System.out.println("Vowels contains");
				
			}
			else {
				System.out.println("Vowels does not contains");
			}
		};
				
		
		sm1.Operate("Varisu");
		sm2.Operate("Varisu");
		sm3.Operate("Varisu");
		sm4.Operate("Varisu");
		StringMethods.print();
	}

}
