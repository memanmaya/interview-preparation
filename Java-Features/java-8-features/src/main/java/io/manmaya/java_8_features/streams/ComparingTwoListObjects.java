package io.manmaya.java_8_features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;

public class ComparingTwoListObjects {
	
	boolean flag = true;
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) {
	
		Employee1 emp11 = new Employee1("name-11", "1001", Arrays.asList( new String[] {"1","2","3"})); 
		Employee1 emp12 = new Employee1("name-22", "2002", Arrays.asList( new String[] {"1","2"}));
		Employee1 emp13 = new Employee1("name-13", "1003", Arrays.asList( new String[] {"1","2"}));
		
		List<Employee1> employee1List = new ArrayList<Employee1>();
		employee1List.add(emp11);
		employee1List.add(emp12);
		employee1List.add(emp13);
		
		
		Employee2 emp21 = new Employee2("name-22", "2002", Arrays.asList( new String[] {"1","2","3"})); 
		Employee2 emp22 = new Employee2("name-22", "2002", Arrays.asList( new String[] {"1","2"}));
		Employee2 emp23 = new Employee2("name-23", "2003", Arrays.asList( new String[] {"1","2"}));
		List<Employee2> employee2List = new ArrayList<Employee2>();
		employee2List.add(emp21);
		employee2List.add(emp22);
		employee2List.add(emp23);
		
		
		//System.out.println(employee1List.stream().anyMatch(e1 -> employee2List.get(0).getItemNumbers().containsAll(e1.getItemNumbers())));
		
		//List<Employee1> listOfItems = employee1List.stream().filter(e1 -> employee2List.get(0).getItemNumbers().containsAll(e1.getItemNumbers())).collect(Collectors.toList());
		
		//List<Employee1> listOfItems = employee1List.stream().filter(e1 -> e1.getName().equalsIgnoreCase("name-11")).collect(Collectors.toList());
		
		//listOfItems.forEach(System.out::println);
		
		/*employee2List.forEach(e2 -> {
			List<Employee1> listOfItems = employee1List.stream().filter(e1 -> e1.getName().equalsIgnoreCase(e2.getName())).collect(Collectors.toList());
			System.out.println(listOfItems);
		});*/
		
		
		//Match the consumableLinkQuantity
		//Match the Gtin
		//Match the itemNumbers
			//then succes
		//List<Employee1> list10 = new ArrayList<Employee1>();
		
		ComparingTwoListObjects t = new ComparingTwoListObjects();
		AtomicReference<Boolean> value = new AtomicReference<>();
		
		
		employee2List.forEach(e2 -> {
			//List<Employee1> listOfItems  = employee1List.stream()
			employee1List.stream()
			 .filter(e1 -> e1.getName().equalsIgnoreCase(e2.getName()))
			 .filter(e1-> {
				 if(e1.getSalary().equals(e2.getSalary())) {
					 e2.getItemNumbers().stream()
					 .forEach(p -> show(p));
					 value.set(true);
					 return true;
				 }
				 //flag = false;
				 t.setFlag(false);
				 value.set(true);
				 return false;
			 })
			 .forEach(e1 -> {
				 System.out.println("e1 Value : " + e1.getName());
				 List<String> e2ItemNumbers = e2.getItemNumbers();
				 e2ItemNumbers.forEach(p ->{
					 if(e1.getItemNumbers().contains(p)) {
						 
					 }else {
						 
					 }
				 });
			 });
			 //.filter(e1 -> e1.getItemNumbers().containsAll(e2.getItemNumbers()))
			 //.map(e1 -> e1.getItemNumbers().stream().filter(p->e2.getItemNumbers().contains(p))).collect(Collectors.toList());
			/*.forEach(e1 -> {
				 //e1.getItemNumbers());
				System.out.println("Hello");
			 })*/
			 ;
			 //System.out.println("Size - " + listOfItems.size() +"Description - " + listOfItems);
			 
			/* .filter(e1->
				 
				 List<String> matchedItemNumbers = e1.getItemNumbers().stream().filter(p1 -> e2.getItemNumbers().equals(p1)).collect(Collectors.toList());
			 )*/
			 
			 
			 
			 //.map(e1->e1.getItemNumbers().containsAll(e2.getItemNumbers()));
			System.out.println("outer");
		});
		
		System.out.println(value.get());
	/*	
		employee1List.forEach(e1->{
			
		});*/
		
		//For each of the employee1List
			//Match the gtin and consumable link quantity
			//Get the list of item numbers.
				//filter the item numbers which are not matching and collects as list.
		
		
		
		
		
		
	}
	
	
	public void checkSpecialItemCode(List<Employee2> employee2List) {
		
	
		
	}
	
	public static void show(String arg) {
		System.out.println("Arguement : " + arg);
		
		Stream<Integer> integerStream = Stream.iterate(0, i -> ++i).limit(10);
		
		Integer sum = integerStream.mapToInt(p -> p).sum();
		System.out.println(sum);
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
