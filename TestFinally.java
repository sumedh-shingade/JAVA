package tester;

public class TestFinally {
	public static void testMe() throws InterruptedException{
		try {
			System.out.println("in meths try");
			String[] ss= {"aa","bb"};
			Thread.sleep(1000);//sleep for 1 sec
			System.out.println(ss[2]);//AOB
			boolean flag=true;
			if(flag) 
				System.exit(0);
				System.out.println("end of try");
			
			}
		//finally executes
		finally {
			System.out.println("in meths finally");
		}
		
	}
public static void main(String[] args) {
	System.out.println("1");
	try {
		testMe();//goes to testme method
		System.out.println("back in main");
		
	}
	
	//after meths finally catch and finally executes
	catch(Exception e) {
		System.out.println("in mains catch");
	}
	finally {
		System.out.println("in mains finally");
	}
}
}
