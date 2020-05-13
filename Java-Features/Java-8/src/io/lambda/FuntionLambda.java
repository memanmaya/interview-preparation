package io.lambda;

import java.util.function.Function;

public class FuntionLambda {
	
	public static void main(String[] args) {
		//Example of Function
		//Function<T,R>
		Function<Integer, Boolean> funtion = f -> f > 10;
		Boolean b = funtion.apply(50);
		System.out.println(b);
		
		
		Function<String, Boolean> stringNotEmptyOrNotNull = s -> {
			if(s == null)
				return false;
			return !s.isEmpty();
		};
		
		System.out.println(stringNotEmptyOrNotNull.apply(""));
		System.out.println(stringNotEmptyOrNotNull.apply("Hello"));
		
		
			
		}
	
		
	}
