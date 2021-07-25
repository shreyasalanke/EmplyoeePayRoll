package com.bridgelabz.emplyoeepayroll;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EmployeePayrollTest {
	@Test
	public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.addEmployee(new EmplyoeeData(1,"Shreya salanke",10000));
		employeePayrollService.addEmployee(new EmplyoeeData(2,"Sharan Gowdar",20000));
		employeePayrollService.addEmployee(new EmplyoeeData(3,"Harsha",30000));
		employeePayrollService.writeEmployeeDataToFile();
		long entries = employeePayrollService.countEntries();
		assertEquals(3, entries);
	}
	@Test
	public void given3EmployeesWhenWrittenToFileShouldPrintEmployeeEntries() 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.addEmployee(new EmplyoeeData(1,"Shreya salanke",10000));
		employeePayrollService.addEmployee(new EmplyoeeData(2,"Sharan Gowdar",20000));
		employeePayrollService.addEmployee(new EmplyoeeData(3,"Harsha",30000));
		employeePayrollService.writeEmployeeDataToFile();
		employeePayrollService.printData();
		long entries = employeePayrollService.countEntries();
		assertEquals(3, entries);
	}

	@Test
	public void given3EmployeesWhenWrittenToFileShouldPrintNumberOfEmployeeEntries() 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.addEmployee(new EmplyoeeData(1,"Shreya salanke",10000));
		employeePayrollService.addEmployee(new EmplyoeeData(2,"Sharan Gowdar",20000));
		employeePayrollService.addEmployee(new EmplyoeeData(3,"Harsha",30000));
		employeePayrollService.writeEmployeeDataToFile();
		long entries = employeePayrollService.countEntries();
		System.out.println("Number of entries are "+entries);
		assertEquals(3, entries);
	}
}
