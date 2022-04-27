package com.revature.models;

public class Department {

	private int id;
	private String dapartmentName;
	private Double departmentBudget;

	// No-args constructor
	public Department() {
		super();
	}

	// This constructor is useful for any SQL INSERT queries that we will be making
	// with JDBC
	public Department(String dapartmentName, Double departmentBudget) {
		super();
		this.dapartmentName = dapartmentName;
		this.departmentBudget = departmentBudget;
	}

	// All-args constructor
	public Department(int id, String dapartmentName, Double departmentBudget) {
		super();
		this.id = id;
		this.dapartmentName = dapartmentName;
		this.departmentBudget = departmentBudget;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDapartmentName() {
		return dapartmentName;
	}

	public void setDapartmentName(String dapartmentName) {
		this.dapartmentName = dapartmentName;
	}

	public Double getDepartmentBudget() {
		return departmentBudget;
	}

	public void setDepartmentBudget(Double departmentBudget) {
		this.departmentBudget = departmentBudget;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", dapartmentName=" + dapartmentName + ", departmentBudget=" + departmentBudget
				+ "]";
	}

}
