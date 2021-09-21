package com.bridgelabz.EmployeePayrollService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EmployeePayrollFileIOService {

	public static String PAYROLL_FILE_NAME = "C:\\Users\\paresh.praveen_ymedi\\payroll-file.txt";
	
	public void writeData(List<Employee>employeePayrollList) {
		StringBuffer empBuffer = new StringBuffer();
		employeePayrollList.forEach(employee -> {
			String employeeString = employee.toString().concat("\n");
			empBuffer.append(employeeString);
		});
		
		try {
			Files.write(Paths.get(PAYROLL_FILE_NAME),empBuffer.toString().getBytes());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void printData() {
		try {
			Files.lines(new File(PAYROLL_FILE_NAME).toPath()).forEach(System.out::println);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
