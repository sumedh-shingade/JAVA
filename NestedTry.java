package tester;

public class NestedTry {
	public static void main(String[] args) {
	try {
		try {
			int a=100/0;	
			}
		catch(ArithmeticException e) 
			{
			System.out.println("1");
			}	
		try {
			String s="sumya";
			System.out.println(Integer.parseInt(s));
			}
		catch(NumberFormatException e) {
			System.out.println("2");
		}
	}
		catch(Exception e) {
			System.out.println("outer try block");
		}
		System.out.println("end of try");
	

}
}

