package com.sample.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static EmployeeBuilder builder() {
		return new EmployeeBuilder();
	}

	public static class EmployeeBuilder {
		private Employee emp;

		public EmployeeBuilder() {
			emp = new Employee();
		}

		public EmployeeBuilder firstName(String firstName) {
			emp.setFirstName(firstName);
			return this;
		}

		public EmployeeBuilder lastName(String lastName) {
			emp.setLastName(lastName);
			return this;
		}

		public Employee build() {
			return emp;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
