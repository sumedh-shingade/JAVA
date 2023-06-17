package com.demo.test;
import java.util.List;
import java.util.ArrayList;


public class TestStream {
public static void main(String[] args) {
	
	//sum of even numbers using stream functions
	List<Integer> lst=new ArrayList<>();
	lst.add(2);
	lst.add(5);
	lst.add(3);
	lst.add(4);
	
	//int even=lst.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
	
	//System.out.println(even);
	
}
}
