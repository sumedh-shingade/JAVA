package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao {
	//declares static set of employees
	private static Set<Employee> empset;
	
	static {
		empset=new HashSet<>();
		empset.add(new Employee(12,"sumedh","dev",2500));
		empset.add(new Employee(13,"fsdefd","sgvsfrgv",2630));
		
	}
	
	public void save(Employee e) {

		empset.add(e);	
	}
	
public Set<Employee> getAll() {
		
		return empset;
	}
	

}
