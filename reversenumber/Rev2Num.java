package com.demo.reversenumber;

public class Rev2Num {
public static void main(String[] args) {
	//using string buffer class
	int num=1234;
	StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();
	System.out.println(rev);
}
}
