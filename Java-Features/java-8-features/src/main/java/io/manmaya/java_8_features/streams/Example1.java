package io.manmaya.java_8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
	
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Stream<Integer> s = integerList.stream()
					.filter(i -> i>5);
		
		s.forEach(i -> System.out.println(i));
		
		new Example1().streamsCollect();
		
		new Example1().sum1to10();
		
		new Example1().printEvenNumbers();
		
		//DoubleStream 
		List<Double> doubleValues = Arrays.asList(10.1, 2.1, 3.4,5.6,1.0);
		Optional<Double> optionalDouble = doubleValues.stream().min((d1,d2) -> {
			if(d1>d2) 
				return 1;
			else 
				return -1;
		});
		System.out.println(optionalDouble.get());
		
		
		doubleValues = Arrays.asList(10.1, 2.1, 3.4,5.6,1.0);
		OptionalDouble average = doubleValues.stream().mapToDouble(p -> p).average();
		System.out.println(average.getAsDouble());
	}
	
	
	public void streamsCollect() {
		Stream<Integer> integerStreams = Stream.of(1,2,3,4,5);
		
		List<Integer> list = integerStreams.collect(Collectors.toList());
		
		list.forEach(i -> System.out.println(i));
		
		
	}
	
	public void sum1to10() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer value = list.stream().reduce(0,(x,y) -> x+y);
		
		System.out.println("Value : " +  value);
		
		Stream<Integer>  integerStream = Stream.iterate(1, i->++i).limit(10);
		
		
		System.out.println("Filtered value :");
		integerStream
				.filter(i -> i%2==0)
				.forEach(i -> System.out.println(i));
		
		//System.out.println(count);
	
		
		
		
	}
	
	public void printEvenNumbers() {
		Stream<Integer> stream = Stream.iterate(2,(i) -> i+2).limit(5);
		//stream.forEach(s -> System.out.println(s));
		
		Integer sum = stream.reduce(0, (a,b)-> a+b);
		System.out.println(sum);
	}
	
	
	
	
}

//Java Streams
/**
 * A sequence of elements supporting sequential and parallel aggregate operations
 * 
 */

//forEach
//Stream.iterate(Integer seed, lambda)
//streamVariable.reduce(seed, (a,b) -> a+b)
//streaVariable.collect(Collectors.toList()) //used for returns collections object like list, map,ect
//streamVariable.count(); //returns long value i.e no. of elements present in stream
//streamVaraibale.filter
