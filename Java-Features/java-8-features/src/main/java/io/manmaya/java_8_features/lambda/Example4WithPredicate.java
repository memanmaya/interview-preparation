package io.manmaya.java_8_features.lambda;

import java.util.function.Predicate;

public class Example4WithPredicate {
	
	public static void main(String[] args) {
		
		Boolean x = true;
		
		Predicate<String> b = (s) -> s.contentEquals("Manmayaa") || s.contentEquals("Manmaya");
		
		System.out.println(b.test("Manmayaaa"));
	}

}
