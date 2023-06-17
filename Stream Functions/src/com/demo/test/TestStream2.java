package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream2 {
public static void main(String[] args) {
	List<Integer> lst=Arrays.asList(5,74,55,35);
	
	List<Integer> s=lst.stream().filter(x->x%5==0 && x>10).collect(Collectors.toList());
	System.out.println(s);
}
}
