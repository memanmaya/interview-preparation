package io.manmaya.java_8_features.lambda.v2;

import java.util.function.Consumer;

public class LambdaBasics {
	
	public static void main(String[] args) {
		
		//Printing 1 to 10 using lambda
		
		 Test t = () -> {
			 System.out.println("I am hello");
		 };
		 
		 t.print();
		 
		 Consumer<Integer> consumerString = c -> {
		 };
		 
		// Consumer<>
		 
		 //consumerString.accept(5);
		 //consumerString.accept(5);
		 consumerString.andThen(c -> System.out.println(c*c)).accept(5);
		 
		 
		
		 
	}
	
	

}

interface Test{
	public void print();
}
