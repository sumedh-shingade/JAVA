package com.demo.service;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		super();
		this.edao=new EmployeeDaoImpl();
	}
	


	@Override
	public void addnewEmployee() {
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter desig");
		String dsg=sc.next();
		System.out.println("enter salary");
		double sal=sc.nextDouble();
	
		Employee e=new Employee(id,nm,dsg,sal);
		edao.save(e);
		
	}

	//Display All 
	@Override
	public Set<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.getAll();
	}



	@Override
	public Employee displayById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

