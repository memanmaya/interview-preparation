import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		
		Thread th = new Thread(() -> System.out.print(Thread.currentThread()));
		th.start();
		
		Stream<Integer> list = Stream.iterate(1, p -> ++p).limit(10);
		int sum = list.reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		list = Stream.iterate(1, p -> ++p).limit(10);
		sum = list.mapToInt(p -> p).sum();
		System.out.println(sum);
		
		list = Stream.iterate(1, p -> ++p).limit(10);
		OptionalDouble optionalDouble = list.mapToInt(p -> p).average();
		System.out.println(optionalDouble.getAsDouble());
		
		list = Stream.iterate(1, p -> ++p).limit(10);
		int[] arrayValues  = list.mapToInt(p -> p*p).toArray();
		for(int value : arrayValues) {
			System.out.println(value);
		}
		
		
	}

}
