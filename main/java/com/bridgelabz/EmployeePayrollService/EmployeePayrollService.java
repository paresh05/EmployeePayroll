package com.bridgelabz.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PareshPraveen
 * @class member employeePayrollList is used to store the list of employees data
 */
public class EmployeePayrollService {

	private List<Employee> employeePayrollList = new ArrayList<>();

	/**
	 * This function is used to read the input from the console
	 * @return nothing
	 */
	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.println("Emter Employee ID: ");
		int id = consoleInputReader.nextInt();
		System.out.println("Emter Employee Name: ");
		String name = consoleInputReader.next();
		System.out.println("Emter Employee Salary: ");
		double salary = consoleInputReader.nextDouble();
		employeePayrollList.add(new Employee(id,name,salary));
	}

	/**
	 * This function is used to print the employees data to the console
	 */
	private void writeEmployee() {
		System.out.println("\nWriting Employee Payroll Roaster to Console\n"+employeePayrollList);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		Scanner consoleInput = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(consoleInput);
		employeePayrollService.writeEmployee();
	}
}
