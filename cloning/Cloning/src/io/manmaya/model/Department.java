package io.manmaya.model;


public class Department implements Cloneable{
	
	private String name;
	private String code;
	
	
	
	public Object clone()throws CloneNotSupportedException{  
		
		return super.clone();  
	}  
	public Department(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", code=" + code + "]";
	}
	
	
	

}
