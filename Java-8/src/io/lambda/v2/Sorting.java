package io.lambda.v2;

import java.util.Arrays;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(new Person("Manmaya5", 20, 5000),
											new Person("Manmaya2", 13, 50001),
											new Person("Manmaya4", 45, 50003));
		
		
		personList.forEach(p -> System.out.println(p));
		
		
		
		
		
		
	}

}

class Person implements Comparable<Person>{
	
	private String name;
	private int age;
	private float salary;

	public Person(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Person p1) {
		return(this.getName().compareTo(p1.getName()));
	}
	
	
	
}