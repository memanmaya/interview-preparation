package io.manmaya.java_8_features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredifinedFunctionalInterfaces {
	
	public static void main(String[] args) {
		predicateExample();
		consumerExample();
		
	}
	
	
	public static void supplierExample(){
		
		//Takes no argument but returns a value 
		
	}
	
	
	public static void consumerExample(){
		
		//Consumer accept argument and does not return any value
		Consumer<String> consumer = c -> System.out.println(c);
		consumer.accept("testMessage");
		
		Consumer<List<String>> consumerMessage = c -> System.out.println(c);
		List<String> messages = Arrays.asList("message1", "message2", "message3");
		consumerMessage.accept(messages);
		messages.forEach(consumer);
		
	}
	
	public static void predicateExample(){
		
		//Predicate accept one argument and returns a boolean based on the operation 
		Predicate<String> predicate = p -> p.startsWith("tr");
		System.out.println(predicate.test("string"));
		System.out.println(predicate.test("tring"));
		
		BiPredicate<Integer,Integer> biPredicate = (p1, p2) -> p1 > p2;
		System.out.println(biPredicate.test(12, 10));
		
		//Other predicates and, or, negate and isEquals
		Predicate<String> predicate2 = p -> p.startsWith("st");
		System.out.println(predicate.and(predicate2).test("string"));
		System.out.println(predicate.and(predicate2).test("asdf"));
		
		System.out.println(predicate.or(predicate2).test("string"));
		System.out.println(predicate.or(predicate2).test("asdf"));
	
	}
	
	

}
