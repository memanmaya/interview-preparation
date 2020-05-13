package io.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Java_8 {
	
	public static void main(String[] args) {
		
		
		Stream<Integer> integerStream = Stream.iterate(1,  p -> ++p).limit(10);
		
		
		OptionalDouble optionalDouble = integerStream.mapToInt(p -> p).average();
		
		System.out.println(optionalDouble.getAsDouble());
		
		
		
		List<Integer> integerList = new ArrayList<Integer>();
		
		integerList.add(2);
		integerList.add(13);
		integerList.add(4);
		integerList.add(5);
		
		
		
		
		Stream<Integer> array = integerList.stream().sorted((p1,p2) -> {
			if(p2>p1)
				return 1;
			else 
				return -1;
		});
		
		
		array.forEach(p -> System.out.println(p));
		
		List<Employee> employeeList = Arrays.asList(new Employee("Manmaya",30), new Employee("Adhiraj", 33), new Employee("Subhash", 40));
		
		Stream<Employee> employeeStream = employeeList.stream().sorted((e1,e2) -> e2.getAge()-(e1.getAge()));
		
		employeeStream.forEach(p -> System.out.println(p));
		
		employeeList.forEach(p -> System.out.println(p));
		
		employeeList.forEach(System.out::print);
		
		
		
	}
	
	public void show() {
		System.out.println("I am show of Java_8 class");
	}

}

class Employee{
	
	String name;
	int age;
	
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
