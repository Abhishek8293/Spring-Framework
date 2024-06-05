package com.spring.javaConfigClass;

public class Student {

	private int rollNumber;

	private String studentName;

	private Address studentAddress;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student(int rollNumber, String studentName, Address studentAddress) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}

}
