package com.bridgelabz.emplyoeepayroll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeePayrollService {
	private List<EmplyoeeData> employePayrollList = new ArrayList<EmplyoeeData>();
	Scanner scanner = new Scanner(System.in);

	public void readEmployeeDataFromConsole() 
	{
		System.out.println("Enter Employee Id");
		int id = scanner.nextInt();
		System.out.println("Enter Employee Name");
		String Name = scanner.next();
		System.out.println("Enter the salary");
		int salary = scanner.nextInt();
		employePayrollList.add(new EmplyoeeData(id, Name, salary));
	}

	public void writeEmployeeDataInConsole() 
	{
		System.out.println("Displaying Employee Pay Roll Data \n"+employePayrollList);
	}
}
