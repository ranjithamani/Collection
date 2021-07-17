package com.xworkz.collection.dto.sort;

import java.io.*;

public class PersonDTO implements Serializable, Comparable<PersonDTO> {
	private String name;
	private int age;
	private String email;

	public PersonDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(PersonDTO ref) {
		int ageOfRef = ref.getAge();
		if (this.age == ageOfRef)
			return 0;
		if (this.age > ageOfRef)
			return 1;
		if (this.age < ageOfRef)
			return -1;
		return 0;
	}

	public PersonDTO(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", email=" + email + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
