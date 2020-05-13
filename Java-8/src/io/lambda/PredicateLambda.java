package io.lambda;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class PredicateLambda {
	
	public static void main(String[] args) {
		//Example of Predicate
		
		//Basically predicates are used to accept some arguments and returns a boolean value based on the operation.
		
		//Predicate<T>
		//Can take any argument but returns boolean based on the operation.
		String s1 = "Hello";
		Predicate<String> predicate = p -> s1.startsWith("He");
		System.out.println(predicate.test(s1));
		
		
		//BiPredicate<T,U>
		//Takes two arguments but returns boolean based on the the operation.
		Integer i1 = 10;
		Integer i2 = 20;
		BiPredicate<Integer,Integer> biPredicate = (p1,p2) -> p1 > p2;
		System.out.println(biPredicate.test(i1, i2));
		
		
		//DoublePredicate
		//Can take one double, and returns the boolean value based on the operation performed on the predicate.
		double d1 = 3.4d;
		Double d2 = 2.4d;
		DoublePredicate doublePredicate = p -> (p > d2);
		System.out.println(doublePredicate.test(d1));
		
		
		//IntPredicate
		//LongPredicate
		
		
		
	}

}
