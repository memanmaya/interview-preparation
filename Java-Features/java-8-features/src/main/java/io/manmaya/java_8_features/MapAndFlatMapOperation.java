package io.manmaya.java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndFlatMapOperation {
	
	public static void main(String[] args) {
		
		
		Stream<Integer>  stream = Stream.iterate(0, p -> p+1);
		
		System.out.println(stream.mapToInt(p -> p).average());
		
		List<Integer> list = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		
		int sum = list.stream().map(x -> x+1).mapToInt(x -> x).sum();
		
		System.out.println("Summation : " + sum);
		
		List<List<Integer>> lists = new ArrayList<>();
		lists.add(list);
		lists.add(list2);
		
		int sum2 = lists.stream().flatMap(x -> x.stream()).mapToInt(x->x).sum();
		System.out.println("Flatmap Summation : " + sum2);
		
		//Will flat error ini mapToInt as x is a stream
		//int sum3 = lists.stream().map(x -> x.stream()).mapToInt(x->x).sum();
		//System.out.println("Flatmap Summation : " + sum2);
	}
	
	

}
