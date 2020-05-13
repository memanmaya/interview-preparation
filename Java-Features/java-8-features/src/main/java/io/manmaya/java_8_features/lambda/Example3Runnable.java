package io.manmaya.java_8_features.lambda;

public class Example3Runnable {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("I am run method of " + Thread.currentThread().getName());
				
			}
		},"Thread-1");
		
		t1.start();
		
		Runnable r = () ->  System.out.println("I am run method of " + Thread.currentThread().getName());
		Thread t2 = new Thread(r, "Thread-2");
		t2.start();
		
		
		Thread t3 = new Thread(() ->  System.out.println("I am run method of " + Thread.currentThread().getName()), "Thread-3");
		t3.start();
	}

}
