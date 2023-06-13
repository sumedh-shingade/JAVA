package test;

public class TestStatic {
	public static int testData;
	static 
	{
	System.out.println("1");
	testData=100;
	}
	static 
	{
		System.out.println("2");
		test();
	}


	private int id;
	
	//non static initializer block
	{
		System.out.println("in non static (instance) initializer block");
	}
	
	TestStatic(int id){
		System.out.println("in cons");
		this.id=id;
	}

	
public static void main(String[] args) {

System.out.println(testData);	
TestStatic ref1=new TestStatic(10);
TestStatic ref2=new TestStatic(20);

}
private static void test() {

	System.out.println("in test : static ");
	testData++;
	
}
}



