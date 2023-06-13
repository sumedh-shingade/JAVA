package test;

import java.util.Arrays;
import static java.lang.System.*;// static import

public class MultiDimArr {
public static void main(String[] args) {
	double[][] data=new double[3][4];
	int value =100;
	for(int i=0;i<data.length;i++) {
		for(int j=0;j<data[i].length;j++) {
			data[i][j]=value++;
			// System.out.println(data[i][j]);
		}
		
	}
	out.println(Arrays.deepToString(data));
	//show();
	MultiDimArr d=new MultiDimArr();
	d.show();
	
}
//static method can access other static method directly
//private static void show() {
//	System.out.println("in show");
//	
//}

private void show() {
	out.println("in show: non static ");
	test(); //non static member can directly access static methods 
}
private static void test() {
	out.println("in test : static ");
}



}
