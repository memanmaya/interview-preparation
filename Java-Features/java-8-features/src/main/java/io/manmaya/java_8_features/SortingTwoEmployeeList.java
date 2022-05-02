package io.manmaya.java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class SortingTwoEmployeeList {
	
	boolean flag = true;
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) {
		
		
		Employee2 emp21 = new Employee2("name-22", "2002", Arrays.asList( new String[] {"1","2","3"})); 
		Employee2 emp22 = new Employee2("name-22", "2002", Arrays.asList( new String[] {"1","2"}));
		Employee2 emp23 = new Employee2("name-23", "2003", Arrays.asList( new String[] {"1","2"}));
		List<Employee2> employee2List = new ArrayList<Employee2>();
		employee2List.add(emp21);
		employee2List.add(emp22);
		employee2List.add(emp23);
	
		Employee1 emp11 = new Employee1("name-11", "1001", Arrays.asList( new String[] {"1","2","3"})); 
		Employee1 emp12 = new Employee1("name-22", "2002", Arrays.asList( new String[] {"1","2"}));
		Employee1 emp13 = new Employee1("name-13", "1003", Arrays.asList( new String[] {"1","2"}));
		Employee1 emp14 = new Employee1("name-13", "1005", Arrays.asList( new String[] {"1","2"}));
		Employee1 emp15 = new Employee1("name-13", "1004", Arrays.asList( new String[] {"1","2"}));
		
		
		
		List<Employee1> employee1List = new ArrayList<Employee1>();
		employee1List.add(emp11);
		employee1List.add(emp12);
		employee1List.add(emp13);
		employee1List.add(emp14);
		employee1List.add(emp15);
		

		Collections.sort(employee1List, (p1,p2) -> {
			int val = p1.getName().compareTo(p2.getName());
			if(val == 0){
				return  p1.getSalary().compareTo(p2.getSalary());
			}
			return val;
		});
		
		employee1List.forEach(e -> System.out.println(e));
		
		
		
		
	}
}

class Employee1{
	private String name;
	private String salary;
	private List<String> itemNumbers;
	
	
	public Employee1(String name, String salary, List<String> itemNumbers) {
		super();
		this.name = name;
		this.salary = salary;
		this.itemNumbers = itemNumbers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public List<String> getItemNumbers() {
		return itemNumbers;
	}
	public void setItemNumbers(List<String> itemNumbers) {
		this.itemNumbers = itemNumbers;
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + ", itemNumbers=" + itemNumbers + "]";
	}	
	
	
}

class Employee2{
	private String name;
	private String salary;
	private List<String> itemNumbers;
	
	
	public Employee2(String name, String salary, List<String> itemNumbers) {
		super();
		this.name = name;
		this.salary = salary;
		this.itemNumbers = itemNumbers;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public List<String> getItemNumbers() {
		return itemNumbers;
	}
	public void setItemNumbers(List<String> itemNumbers) {
		this.itemNumbers = itemNumbers;
	}	
	
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", salary=" + salary + ", itemNumbers=" + itemNumbers + "]";
	}	
	
}
