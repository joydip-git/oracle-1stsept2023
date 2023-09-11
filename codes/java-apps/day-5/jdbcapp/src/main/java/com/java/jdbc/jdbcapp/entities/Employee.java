package com.java.jdbc.jdbcapp.entities;

import java.security.InvalidParameterException;

public class Employee {

	private Integer employeeId;
	private String employeeName;

	public Employee() {
	}

	public Employee(Integer employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			throw new NullPointerException("null reference");

		if (!(obj instanceof Employee))
			throw new InvalidParameterException("obj is not of type Employee");

		if (this == obj)
			return true;

		Employee other = (Employee) obj;
		if (!(this.employeeId == other.employeeId))
			return false;

		return true;

	}

	@Override
	public int hashCode() {
		return Integer.hashCode(employeeId);
	}

	@Override
	public String toString() {
		return "Id: " + employeeId + ", Name: " + employeeName;
	}

}
