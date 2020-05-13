package io.lambda.functional;


@FunctionalInterface
public interface FunctionalInterfaceExample {
	public void foo();
	public default void show() {
		System.out.println("This is the sample show method ");
	}
	//public void show(); //Will flag error, showing FunctionalInterfcaeExample is not functional interface
}

//An interface is considered as functional interface, if there is only one abstract method, but additionally it can contain static and default methods.
//This annotation is present in java.lang page
//This annotation restricts developer/user for adding more methods to it.
//Applying annotation to functional interface is optional, but recommended to use so that the intentions are clear about how this interface is meant to use.
//public void show(); //Will flag error, showing FunctionalInterfcaeExample is not functional interface
//Instead of defining our own functional interface for the sake of use lambd, we can use interfaces already defined in java.util.function Package
//Example like Predicate, Consumer etc
