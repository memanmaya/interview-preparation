package io.method.reference;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example1 {
	
	
	public static void main(String[] args) {
		Thread t = new Thread(()->show());
		t.start();
		
		Thread t2 = new Thread((Example1::show));
		t2.start();
		
		
		//()->show() exact same as Example1::show
		
		Consumer<String> s = p -> System.out.println(p);
		
		s.accept("Hello Man !!!");
		
		Consumer<String> s1 = System.out::println;
	
		s1.accept("Hello Method reference !!!");
		
		Supplier s2= () -> {int i = show(); return i;}; 
		System.out.println(s2.get());
		
		
		//Here actually, if method reference is taking a place of something that does not accept then the 
		//compiler knows that Method reference is not going to accept any argument
		//However if it is taking place of something which accepts argument then it will pass that kind of agrument to it.
	}

	
	
	public static Integer show() {
		System.out.println("Hello world");
		return 20;
	}
}
