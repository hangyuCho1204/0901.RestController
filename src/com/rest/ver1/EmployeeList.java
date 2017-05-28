package com.rest.ver1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employees")
public class EmployeeList {
	List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "EmployeeList [employee=" + employee + "]";
	}
}
