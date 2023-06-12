package tester;

public class Exception1 {
public static void main(String[] args) {
	try {
	int a=100/10;
	System.out.println(a);//AE
	String b="a1234";
	System.out.println(Integer.parseInt(b));//NFE
	b="hello";
	System.out.println(b.charAt(0));//NPE
	
	int[] arr= {1,2,3,4,5};
	System.out.println(arr[5]);//AOB
	System.out.println("in try block");
	}
//	catch(NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
//		System.out.println("1");
//	}
	catch(Exception e){
		System.out.println("in catch all block");
		 //System.out.println(e.getMessage());
		//System.out.println(e.toString());
		e.printStackTrace();
		//System.out.println(e);
	}
	System.out.println("main over.....");
	
	
	
	}
}
