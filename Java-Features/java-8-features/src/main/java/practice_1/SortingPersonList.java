package practice_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonList {
	
	public static void main(String[] args) {
		
		
		List<Person> personList = Arrays.asList(new Person("Manmaya5", 20, 5000),
											new Person("Manmaya2", 13, 50001),
											new Person("Manmaya4", 45, 50003));
		
		
		System.out.println("Using anonymous class : ");
		Collections.sort(personList, new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2){
				return p1.getName().compareTo(p2.getName());
			}
		});
		System.out.println("By Name : ");
		personList.forEach(p -> System.out.println(p));
		
		Collections.sort(personList, new Comparator<Person>(){
			
			@Override
			public int compare(Person p1, Person p2){
				return (int)(p1.getSalary()-p2.getSalary());
			}
			
		});
		System.out.println("By Salary : ");
		personList.forEach(p -> System.out.println(p));
		
		System.out.println("\n\nUsing Lambda Expression : ");
		System.out.println("By Name : "); 
		Collections.sort(personList, (p1,p2) -> p1.getName().compareTo(p2.getName()));
		personList.forEach(p -> System.out.println(p));
		
		System.out.println("By Age : ");
		Collections.sort(personList, (p1,p2) -> p1.getAge() - p2.getAge());
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