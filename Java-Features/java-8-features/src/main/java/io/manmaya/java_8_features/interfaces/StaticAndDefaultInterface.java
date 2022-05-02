package io.manmaya.java_8_features.interfaces;

public class StaticAndDefaultInterface implements ParentInterface2,ParentInterface{
	
	int x = 10;
	public void show1() {
		System.out.println("I am overriden default method");
	}
	
	public static void main(String[] args) {
		ParentInterface pi = new StaticAndDefaultInterface();
		pi.show1();
		pi.show4();
		ParentInterface.show();
		ParentInterface.show3();
		pi.show1();
		//pi.x = 10;
		System.out.println(pi.x);
		
		pi.show1();
		ParentInterface.show();
	}

}

interface ParentInterface{
	
	int x = 5;
	static public void show() {
		System.out.println("I am static show of interface");
	}
	
	default public void show1() {
		System.out.println("I am default show of interface");
	}
	
	default public void show4() {
		System.out.println("I am default show of interface");
	}
	
	static public void show3() {
		System.out.println("I am static show of interface");
	}
}

interface ParentInterface2{
	static public void show() {
		System.out.println("I am static show of ParentInterface2");
	}
	static public void show2() {
		System.out.println("I am static show of ParentInterface2");
	}
	
	default public void show1() {
		System.out.println("I am default show of ParentInterface2");
	}
}
