package io.manmaya.model;

public class Employee implements Cloneable{
	
	private String empName;
	private String empCode;
	private Department department;
	
	
	public Employee(String empName, String empCode, Department department) {
		super();
		this.empName = empName;
		this.empCode = empCode;
		this.department = department;
	}
	
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empCode=" + empCode + ", department=" + department + "]";
	}
	
	

}
