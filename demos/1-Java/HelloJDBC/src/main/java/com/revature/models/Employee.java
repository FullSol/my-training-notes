package com.revature.models;

import java.time.LocalDate;

public class Employee {

	private int id;
	private String employeeFirstName;
	private String employeeLastName;
	private LocalDate employeeBirthdate;
	private double employeeMonthlyIncome;
	private Department employeeDepartment;
	private LocalDate employeeHireDate;
	private String employeeJobTitle;
	private String employeeEmail;

	public Employee() {
		super();
	}

	public Employee(String employeeFirstName, String employeeLastName, LocalDate employeeBirthdate,
			double employeeMonthlyIncome, Department employeeDepartment, LocalDate employeeHireDate,
			String employeeJobTitle, String employeeEmail) {
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeBirthdate = employeeBirthdate;
		this.employeeMonthlyIncome = employeeMonthlyIncome;
		this.employeeDepartment = employeeDepartment;
		this.employeeHireDate = employeeHireDate;
		this.employeeJobTitle = employeeJobTitle;
		this.employeeEmail = employeeEmail;
	}

	public Employee(int employee, String employeeFirstName, String employeeLastName, LocalDate employeeBirthdate,
			double employeeMonthlyIncome, Department employeeDepartment, LocalDate employeeHireDate,
			String employeeJobTitle, String employeeEmail) {
		super();
		this.id = employee;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeBirthdate = employeeBirthdate;
		this.employeeMonthlyIncome = employeeMonthlyIncome;
		this.employeeDepartment = employeeDepartment;
		this.employeeHireDate = employeeHireDate;
		this.employeeJobTitle = employeeJobTitle;
		this.employeeEmail = employeeEmail;
	}

	public int getEmployee() {
		return id;
	}

	public void setEmployee(int employee) {
		this.id = employee;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public LocalDate getEmployeeBirthdate() {
		return employeeBirthdate;
	}

	public void setEmployeeBirthdate(LocalDate employeeBirthdate) {
		this.employeeBirthdate = employeeBirthdate;
	}

	public double getEmployeeMonthlyIncome() {
		return employeeMonthlyIncome;
	}

	public void setEmployeeMonthlyIncome(double employeeMonthlyIncome) {
		this.employeeMonthlyIncome = employeeMonthlyIncome;
	}

	public Department getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(Department employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public LocalDate getEmployeeHireDate() {
		return employeeHireDate;
	}

	public void setEmployeeHireDate(LocalDate employeeHireDate) {
		this.employeeHireDate = employeeHireDate;
	}

	public String getEmployeeJobTitle() {
		return employeeJobTitle;
	}

	public void setEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	@Override
	public String toString() {
		return "Employee [employee=" + id + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", employeeBirthdate=" + employeeBirthdate + ", employeeMonthlyIncome="
				+ employeeMonthlyIncome + ", employeeDepartment=" + employeeDepartment + ", employeeHireDate="
				+ employeeHireDate + ", employeeJobTitle=" + employeeJobTitle + ", employeeEmail=" + employeeEmail
				+ "]";
	}

}
