package io.manmaya.java_8_features.exception;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ExceptionHandling {
	
	
	public static void show() throws IOException{
		System.out.println("I am show");
	}
	
	
	public static void main(String[] args) {
		
		
		Stream<Integer> i = Stream.iterate(1, p -> ++p).limit(10);
		
		i.forEach(value ->{
			System.out.println(value);
			lambdaWrapper(value1-> System.out.println(value1));
		});
	}
	static Consumer<Integer> lambdaWrapper(Consumer<Integer> consumer) {
	    return i -> {
	        try {
	            consumer.accept(i);
	            show();
	        } catch (IOException e) {
	            System.err.println(
	              "Arithmetic Exception occured : " + e.getMessage());
	        }
	    };
	}

}
