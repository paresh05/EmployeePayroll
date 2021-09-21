package com.bridgelabz.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PareshPraveen
 * @class member employeePayrollList is used to store the list of employees data
 */
public class EmployeePayrollService {
	
	public enum IOService{CONSOLE_I0, FILE_IO, DB_IO, REST_IO};

	private List<Employee>employeePayrollList;
	
	public EmployeePayrollService() {
		
	}
	public EmployeePayrollService(List<Employee> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}
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
	public void writeEmployee(IOService ioService) {
		if(ioService.equals(IOService.CONSOLE_I0))
			System.out.println("\nWriting Employee Payroll Roaster to Console\n"+employeePayrollList);
		else if(ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().writeData(employeePayrollList);
	}
	
	public void printEmployee(IOService ioService) {
		if(ioService.equals(IOService.CONSOLE_I0))
			System.out.println("\nWriting Employee Payroll Roaster to Console\n"+employeePayrollList);
		else if(ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().printData();
	}
}
