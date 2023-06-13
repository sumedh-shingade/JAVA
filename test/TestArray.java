package test;

import java.util.Arrays;

public class TestArray {
public static void main(String[] args) {
	//dynamic init of array:class loading,array object is created in heap ,array inited
	int[] ints= {1,2,3,4,5}; //java comp adds implicitly new int[]

//	for(int i:ints) {
//		System.out.println(i);
//	}
	
	System.out.println("Array content"+Arrays.toString(ints));
	
}
}
