package io.manmaya.shallow;

import io.manmaya.model.Department;
import io.manmaya.model.Employee;

public class ShallowCloningExample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department department  = new Department("CSC", "001");
		
		Employee employee = new Employee("Manmaya", "3985", department);
		
		System.out.println("Before Cloning : " + employee);
		
		Employee cloneEmployee = (Employee) employee.clone();
		
		cloneEmployee.setEmpName("Manmaya2");
		
		System.out.println("===============================");
		
		System.out.println("After Cloning employee : " + employee);
		
		System.out.println("After Cloning cloneEmployee: " + cloneEmployee);
		
		
		System.out.println("===============================");
		
		cloneEmployee.getDepartment().setName("MSC");
		System.out.println("After Cloning employee : " + employee);
		
		System.out.println("After Cloning cloneEmployee: " + cloneEmployee);
		
		
	}

}
