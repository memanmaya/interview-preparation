package io.manmaya.java_8_features.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PatternMatcher {
	
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("Hello", "hi", "Manmaya","hi");
		
		System.out.println(stringList.stream().anyMatch(p->p.equals("hi")));
		
		Stream<Integer> integerList = Stream.iterate(1, p->++p).limit(10);
		//integerList.forEach(c -> System.out.println(c));
		
		int sum = integerList.reduce(0, (x,y) -> x+y);
		System.out.println(sum);
		
		List<String> list = stringList.stream().collect(Collectors.toList());
		list.forEach(l -> System.out.println(l));
		
		long listCount = stringList.stream().count();
		System.out.println(listCount);
		
		Map<String, Long> mapCount = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		/*for(Map.Entry<String, Long> count : mapCount) {
			System.out.println(count);
		}*/
		
		 //Sort a map and add to finalMap
		Map<String, Long> finalMap = new LinkedHashMap<>();
		mapCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
        
        
        Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String obj1, String obj2) {
				
				return obj2.compareTo(obj1);
			}
        	
        };
        Collections.sort(stringList,c);
        
        stringList.forEach(p -> System.out.println(p));
        
        
        Collections.sort(stringList, (s1,s2) -> s1.compareTo(s2));
        
        stringList.forEach(p -> System.out.println(p));
        
        
        Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("I am run method of the th thread class");
				
			}
        	
        });
		
        th.start();
        
        
        Thread th2 = new Thread(() -> System.out.println("I am thread of lambda"));
		th2.start();
	}

}
