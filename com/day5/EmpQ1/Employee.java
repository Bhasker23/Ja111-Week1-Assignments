package com.day5.EmpQ1;



public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public Employee() {
	
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		
		this.netSalary = this.salary - ((this.salary*pfpercentage)/100);
		
	}
	
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	
	

	
}
