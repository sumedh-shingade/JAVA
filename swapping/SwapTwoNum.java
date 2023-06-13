package swapping;

public class SwapTwoNum {
public static void main(String[] args) {
	
	int a=5;
	int b=6;
	
	System.out.println("before swap: a= "+ a + " b= "+b );

	//without using third variable (+ and - )
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("before swap: a= "+ a + " b= "+b );
}
}
