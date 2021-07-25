package com.bridgelabz.emplyoeepayroll;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EmployeePayrollTest {
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.addEmployee(new EmplyoeeData(1,"Jeff Bezos",10000));
		employeePayrollService.addEmployee(new EmplyoeeData(2,"Bill Gates",20000));
		employeePayrollService.addEmployee(new EmplyoeeData(3,"Mark Z",30000));
		employeePayrollService.writeEmployeeDataToFile();
		long entries = employeePayrollService.countEntries();
		assertEquals(3, entries);
	}
}