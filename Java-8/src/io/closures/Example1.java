package io.closures;

public class Example1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		//num2 = 30; // Error
		
		ClosureTest p = new ClosureTest() {
			@Override
			public void process(int i) {
				//num2 = 30; // Can't do this, will flag an error, the values which are being as passed as functionality need to be final.
							//But in java-8, we have the flexibility not to declare final but we can't change the value in local scope of inner class.
				//System.out.println(i + num2);
				System.out.println(i + 50);
			}
		};
		new Example1().show(num1, p);
		//num2 = 30; //Error
		
		//Lamda way of implementing 
		
		ClosureTest p1 = i -> System.out.println(i+num2);
		new Example1().show(num1, p1);
		
		//num2 = 50; Not allowed aswell.
	}
	
	public void show(int num1, ClosureTest closureTest) {
		closureTest.process(num1);
	}
}

interface ClosureTest{
	public void process(int i);
}

