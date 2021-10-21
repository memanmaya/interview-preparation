package com.manmaya.practice.basic;

import java.util.Scanner;

public class ReadingAFile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Reading a string line
		System.out.println("Enter a string ");
		String stringLine = sc.nextLine();
		System.out.println(stringLine);
		
		//Reading an integer
		System.out.println("Enter a integer");
		Integer integer = sc.nextInt();
		System.out.println(integer);

		
		//Reading a string 
		System.out.println("Enter a string ");
		String string = sc.next();
		System.out.println(string);
		
		//Note- The above does not read space character.
		

		
		sc.close();
	}

}
