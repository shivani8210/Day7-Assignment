package com.shi;

class Member {

	String name;

	int age;

	String phoneNumber;

	String address;

	double salary;

	public void printSalary() {

		System.out.println("Salary " + salary);

	}

}

class Employee extends Member {

	String specialization;

}

class Manager extends Member {

	String department;

}



