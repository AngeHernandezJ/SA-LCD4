package com.generation;

//Angelica Hernández
//6/6
//Revisó: Andrea Sánchez

public class FizzBuzz {

	public static void generador () {
		for (int i = 1; i <= 100; i++) {
			System.out.println(imprimir(i));			
		}
	}
	
	public static String imprimir(int i) {
		if (i % 3 == 0) {
			if (i % 5 == 0) {
				return "FizzBuzz";
			}
			return "Fizz";
		}
		else if(i % 5 == 0) {
			return "Buzz";
		}
		else {
			return String.valueOf(i);
		}
	}
		
}
