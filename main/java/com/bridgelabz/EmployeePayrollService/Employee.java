package com.bridgelabz.EmployeePayrollService;

public class Employee {

	public int id;
	public String name;
	public double salary;

	/**
	 * @param id is the Employee id
	 * @param name is Employee name
	 * @param salary is Employee salary
	 */
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
