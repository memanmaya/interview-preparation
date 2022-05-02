package io.manmaya.java_8_features;

import java.util.ArrayList;
import java.util.List;

public class ArithematicOperations {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		List<Integer> arrIntegers = new ArrayList<Integer>();
		
		arrIntegers.add(1);
		arrIntegers.add(2);
		
		Float sum = arrIntegers.stream().reduce(0,(a, b) -> a+b)/(float)arrIntegers.size();
		System.out.println(sum);
		System.out.println(arrIntegers.stream().mapToInt(x -> x).sum());
		System.out.println(arrIntegers.stream().mapToInt(x -> x).average());
	}

}
  