package com.xworkz.collections.list.dto;

import java.io.Serializable;
import java.util.Comparator;

public class DeveloperDTO implements Serializable, Comparator<DeveloperDTO> {
	private String name;
	private int age;
	private String designation;
	private double salary;
	private double totalExp;

	public DeveloperDTO() {
	}

	public DeveloperDTO(String name, int age, String designation, double salary, double totalExp) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
		this.totalExp = totalExp;
	}

	@Override
	public int compare(DeveloperDTO obj1, DeveloperDTO obj2) {
		if (obj1.getAge() == obj2.getAge())
			return 0;
		if (obj1.getAge() > obj2.getAge())
			return 1;
		if (obj1.getAge() < obj2.getAge())
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "DeveloperDTO [name=" + name + ", age=" + age + ", designation=" + designation + ", salary=" + salary
				+ ", totalExp=" + totalExp + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getTotalExp() {
		return totalExp;
	}

	public void setTotalExp(double totalExp) {
		this.totalExp = totalExp;
	}

}
