package io.manmaya.java_8_features.lambda;

public class RunnableLambda {
	
	
	public static void main(String[] args) {
		Runnable lambda = () -> System.out.println("I am runnable lambda");
		Thread th = new Thread(lambda);
		th.start();
		
		
		
		
		
	}

}
