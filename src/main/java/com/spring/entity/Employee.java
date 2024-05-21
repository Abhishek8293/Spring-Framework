package com.spring.entity;

public class Employee {

	private Integer empId;
	private String empName;
	private String email;

	public Employee(Integer empId, String empName, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}

	public Employee() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + "]";
	}

}
