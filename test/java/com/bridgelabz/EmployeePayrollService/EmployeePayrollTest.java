
package com.bridgelabz.EmployeePayrollService;

import java.util.Arrays;

import org.junit.Test;

public class EmployeePayrollTest {

	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeesEntries() {
		Employee[] arrayOfEmployees = {
				new Employee(1, "Jeff Bezos", 100000.0),
				new Employee(2, "Bill Gates", 200000.0),
				new Employee(3, "Mark Zuckerberg", 300000.0)
		};
		
		EmployeePayrollService employeePayrollService;
		
		employeePayrollService  = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
		employeePayrollService.writeEmployee(EmployeePayrollService.IOService.FILE_IO);
		employeePayrollService.printEmployee(EmployeePayrollService.IOService.FILE_IO);
	}
}
