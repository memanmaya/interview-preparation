package io.manmaya.java_8_features.lambda;

public class Example2StringLength {

	public static void main(String[] args) {
		
		//Variant - 1
		LengthInterface lengthInterface = (String s) -> {
			return s.length();
		};
		System.out.println(lengthInterface.length("Hello"));
		
		//Variant - 2 
		lengthInterface = (s) -> {
			return s.length();
		};
		System.out.println(lengthInterface.length("Hello"));
		
		//Variant - 3 
		lengthInterface = (s) -> s.length();
		System.out.println(lengthInterface.length("Hello"));
		
		//Variant - 4 
		lengthInterface = s -> s.length();
		System.out.println(lengthInterface.length("Hello"));
		
		new Example2StringLength().printLambda(s->s.length());
		
		new Example2StringLength().printLambda(s->{
				s.length();
				System.out.println("Defination of lambda expression");
				return 20;
			}
		);
		
		
		
	}
	public void printLambda(LengthInterface lengthInterface) {
		System.out.println(lengthInterface.length("Hello World"));
	}
}


interface LengthInterface{
	int length(String s);
}
