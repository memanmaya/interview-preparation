package io.sum;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Summation1To10 {
	
	public static void main(String[] args) {

		Function<List<Integer>, Integer> sumIntegerFuntion = p -> {
			int sum = 0;
			for(Integer i : p) {
				sum +=i;
			}
			return sum;
		};
		
			List<Integer> integerValues = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
			System.out.println(sumIntegerFuntion.apply(integerValues));	
			
			int sum = integerValues.stream().reduce(0, (x,y) -> x+y);
			System.out.println(sum);
			
			Stream<Integer> integerList  = Stream.iterate(1, p-> ++p).limit(10);
			Integer sumValue1To10 =  integerList.reduce(0,(x,y) -> x+y);
			System.out.println(sumValue1To10);
	}

}
