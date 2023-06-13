package com.demo.reversenumber;

public class RevNo {
public static void main(String[] args) {
	//using string builder
	int num=1234;
	
	StringBuilder sb=new StringBuilder();
	sb.append(num);
	StringBuilder rev=sb.reverse();
	System.out.println(rev);
}
}
