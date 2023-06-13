package swapping;

public class Swap2Num {
public static void main(String[] args) {
	
	int a=5;
	int b=6;
	int temp=0; //using third variable
	
	System.out.println("before swap: a= "+ a + " b= "+b );
	
	temp=a;
	a=b;
	b=temp;
	
	
	System.out.println("after swap: a= "+ a +" b= "+b);
}
}
