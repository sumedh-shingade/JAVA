package swapping;

public class Swap2No {
	public static void main(String[] args) {

		int a=5;
		int b=6;
		int temp=0; //using third variable
		
		System.out.println("before swap: a= "+ a + " b= "+b );
		
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("before swap: a= "+ a + " b= "+b );
		
	}

}
