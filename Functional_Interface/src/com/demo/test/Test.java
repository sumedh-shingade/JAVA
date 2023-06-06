package com.demo.test;

import com.demo.beans.MyClass;

import interfaces.I1;
import interfaces.MyfunctionalInterface;

public class Test {
	public static void main(String[] args) {
		I1 ob=new MyClass();
		ob.m11();
		((MyClass)ob).m21();
		ob.m31(12);
		
		
		//comparing the length of strings
		//strinterface is a variable
		MyfunctionalInterface<String> strinterface=(x,y)->{
			return x.length() > y.length() ? x : y;
			};
		String s=strinterface.mycompare("Hello","World");
		System.out.println(s);
		
		//comparing the integers 
		MyfunctionalInterface<Integer> intinterface=(x,y)->{
			return x>y ? x:y;};
			
		int n=intinterface.mycompare(45,50);	
		System.out.println(n);
		}
		
	}

