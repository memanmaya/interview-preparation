package io.manmaya.java_8_features.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonList {
	
	public static void main(String[] args) {
		
		
		List<Person> personList = Arrays.asList(new Person("Manmaya5", 20, 5000),
											new Person("Manmaya2", 13, 50001),
											new Person("Manmaya4", 45, 50003));
		
		System.out.println("Default Sort result using comparable <Descending by name> ");
		for(Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println("Using for-each");
		//Foreach method takes a consumer, so the argument which is passed.
		personList.forEach(p -> System.out.println(p));
		
		
		
		Comparator<Person> pcByName = (Person p1, Person p2) -> {
				return p1.getName().compareTo(p2.getName());
		};
		
		Comparator<Person> pcByAge = (p1, p2) -> p1.getAge() - p2.getAge();
		
		Collections.sort(personList,pcByName);
		System.out.println("Sort By Name : ");
		for(Person person : personList) {
			System.out.println(person);
		}
		
		Collections.sort(personList,pcByAge);
		System.out.println("Sort By Age : ");
		for(Person person : personList) {
			System.out.println(person);
		}
		
		
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getSalary() > p2.getSalary()) {
					 return 1; 
				 }else if(p1.getSalary() < p2.getSalary()) {
					 return -1;
				 }else {
					 return 0;
				 }
			}
			
		});
		
		
		System.out.println("Sort By Salary : ");
		for(Person person : personList) {
			System.out.println(person);
		}
		
		Comparator<Person> pcBySalary = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				
				 if(p1.getSalary() > p2.getSalary()) {
					 return 1; 
				 }else if(p1.getSalary() < p2.getSalary()) {
					 return -1;
				 }else {
					 return 0;
				 }
					
			}
			
		};
		Collections.sort(personList,pcBySalary);
		System.out.println("Sort By Salary : ");
		for(Person person : personList) {
			System.out.println(person);
		}
		
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