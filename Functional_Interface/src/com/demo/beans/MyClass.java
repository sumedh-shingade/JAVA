package com.demo.beans;

import interfaces.I1;
import interfaces.I2;

public class MyClass implements I1,I2 {

	@Override
	public void m21() {
		System.out.println("m21");
	}

	@Override
	public void m22() {
		System.out.println("m22");
	}

	@Override
	public void m11() {
		System.out.println("m11");
	}

	@Override
	public void m12() {
		System.out.println("m12");
	}
	
	
	//default methods 

	@Override
	public int m31(int x) {
	 int ans=I1.super.m31(x);
	 int ans1=I2.super.m31(x);
	return ans+ans1;
	 
	}


}
