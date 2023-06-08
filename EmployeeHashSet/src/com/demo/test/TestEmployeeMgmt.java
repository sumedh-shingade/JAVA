package com.demo.test;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.service.EmployeeServiceImpl;
import com.demo.service.EmployeeService;



public class TestEmployeeMgmt {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	EmployeeService es=new EmployeeServiceImpl();
	
	int choice =0;
	do {
		System.out.println("1. Add new Employee\n2. Display all\n 3. Display by id\n 4. Display by name");
		System.out.println("5. sort by sal\n 6. sort by name\n 7. modify sal\n 8. delete by id\n 9.exit");
		System.out.println("Choice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			es.addnewEmployee();
			break;
		case 2:
			
			Set<Employee> s=es.displayAll();
			s.forEach(a->{System.out.println(a);});
			break;
		case 3:
			
		
		
		case 9:
			sc.close();
			System.out.println("Thank you !");
			break;
		default:
			System.out.println("wrong choice");
	}

	}while(choice!=9);
}
}
