package io.manmaya.java_8_features.lambda;

public class Example1 {
	
	public static void main(String[] args) {
		
		//Concrete implementation
		GreetingImpl greetingImpl = new GreetingImpl();
		
		//Anonymous inner class
		GreetingInterface t = new GreetingInterface() {
			public void foo() {
				System.out.println("Hello world from Annonymous Inner class");
			}
		};
		
		//Lambda 
		GreetingInterface helloGreeting = () -> System.out.println("Hello from Lambda");
		
		helloGreeting.foo();
		t.foo();
		greetingImpl.foo();
	}

}

class GreetingImpl implements GreetingInterface{
	
	public void foo() {
		System.out.println("Hello world from Greeting Impl");
	}
}

interface GreetingInterface{
	void foo();
}
