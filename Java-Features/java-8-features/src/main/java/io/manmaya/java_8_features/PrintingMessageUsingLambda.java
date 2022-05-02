package io.manmaya.java_8_features;

public class PrintingMessageUsingLambda {

	public static void main(String[] args) {
		Message message = m -> System.out.println("Hello!! I am lambda message - " + m);
		message.printMessage("f");
		
		//Passing a function as an argument
		show(message);
	}
	
	//Passing a function as an argument
	public static void show(Message message){
		message.printMessage("Show Method");
	}
}


interface Message{
	void printMessage(String message);
}
