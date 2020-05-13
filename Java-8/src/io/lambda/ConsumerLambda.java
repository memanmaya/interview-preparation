package io.lambda;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

public class ConsumerLambda {
	
	public static void main(String[] args) {
		//Examples of Consumer

		//Consumer<T>
		//Takes one argument and returns no result, basically can be used to print the values after performing operation.
		Consumer<String> consumer = c -> {System.out.println(c);};
		consumer.accept("Hello");
		consumer.accept("World");
		//consumer.andThen(consumer);
		
		//BiConsumer<T,U>
		
		//DoubleConsumer
		//IntConsumer
		//LongConsumer
		LongConsumer longConsumer = c -> System.out.println(c);
		longConsumer.accept(10);
		LongConsumer t = longConsumer.andThen(longConsumer);
		
		t.andThen(t);
		t.andThen(t);
		t.andThen(t);
		//ObjDoubleConsumer<T>
		
	}

}
