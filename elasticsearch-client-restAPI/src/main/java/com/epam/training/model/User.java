package com.epam.training.model;

import java.util.Date;

public class User {
	private String name;
	private String gender;
	private Date birthDate;
	private String salary;

	public User() {
		super();
	}

	public User(String name, String gender, Date birthDate, String salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}
