package com.bridgelabz.emplyoeepayroll;

public class EmplyoeePayRollMain {
	public static void main(String[] args) 
	{
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		System.out.println("Welcolme to Employee PayRoll");
		employeePayrollService.readEmployeeDataFromConsole();
		employeePayrollService.writeEmployeeDataInConsole();
	}
	}
