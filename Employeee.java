package com.fmap;

import java.util.List;

public class Employeee {

	String name;
	List<Long> phoneNumbers;

	public Employeee(String name, List<Long> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employeee [name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}

}
