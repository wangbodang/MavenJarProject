package com.wangbodang.demo.entity;

public class UserEntity {
	private Integer id;
	private String name;
	private Double salary;
	
	
	
	public UserEntity() {
		this.id = 33;
		this.name = "wangbodang";
		this.salary = 9000.00;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
