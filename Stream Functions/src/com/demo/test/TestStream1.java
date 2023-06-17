package com.demo.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class TestStream1 {
public static void main(String[] args) {
	//square of numbers 
	List<Integer> lst=new ArrayList<>();
	lst.add(2);
	lst.add(4);
	lst.add(3);
	List<Integer> s=lst.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println(s);
}
}
