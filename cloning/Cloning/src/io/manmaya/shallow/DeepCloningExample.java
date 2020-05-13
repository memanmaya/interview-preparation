package io.manmaya.shallow;

import io.manmaya.model.DeepCopyEmployee;
import io.manmaya.model.Department;

public class DeepCloningExample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department department  = new Department("CSC", "001");
		
		DeepCopyEmployee employee = new DeepCopyEmployee("Manmaya", "3985", department);
		
		System.out.println("Before Cloning : " + employee);
		
		DeepCopyEmployee cloneEmployee = (DeepCopyEmployee) employee.clone();
		
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
