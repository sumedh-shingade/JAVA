package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class TestStream3 {
public static void main(String[] args) {
	//sort the elements of array
	List<Integer> lst=new ArrayList<>();
	lst.add(2);
	lst.add(5);
	lst.add(3);
	lst.add(4);
	lst.stream().sorted().forEach(x->System.out.println(x));
	
}
}
