package io.manmaya.java_8_features.lambda;

import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierLambda {
	
	public static void main(String[] args) {
		//Examples of Supplier
		
		//Supplier<T>
		Supplier<String> supplierString = () -> "String";
		System.out.println(supplierString.get());
		
		Predicate<String> booleanPredicate = s->s.isEmpty();
		System.out.println(booleanPredicate.test(""));
		System.out.println(booleanPredicate.test("Hello"));
		
		DoubleSupplier ds = () -> Math.random();
		
		System.out.println(ds.getAsDouble());
		
	}

}
