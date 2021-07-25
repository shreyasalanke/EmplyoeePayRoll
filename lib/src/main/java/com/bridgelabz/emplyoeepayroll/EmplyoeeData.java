package com.bridgelabz.emplyoeepayroll;

public class EmplyoeeData {
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	public EmplyoeeData(int employeeId, String employeeName, int employeeSalary) 
	{
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() 
	{
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "";
	}
}
