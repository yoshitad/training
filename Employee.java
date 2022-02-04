package com.pack;

public class Employee {
	
	int employeeId;
	double salary;
	String department;
	boolean ispresent;
	long phno;
	char gender;
	float incr;
	
	Employee(){
		System.out.println("I am default constructor");
	}
	
	
	public Employee(int employeeId, double salary, String department, boolean ispresent, long phno, char gender,
			float incr) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
		this.department = department;
		this.ispresent = ispresent;
		this.phno = phno;
		this.gender = gender;
		this.incr = incr;
	}

	int add(int a,int b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println("int-->"+ emp.employeeId);
		System.out.println("double-->"+ emp.salary);
		System.out.println("String-->"+ emp.department);
		System.out.println("boolean-->"+ emp.ispresent);
		System.out.println("long-->"+ emp.phno);
		System.out.println("char-->"+ emp.gender);
		System.out.println("float-->"+ emp.incr);
	}

}
