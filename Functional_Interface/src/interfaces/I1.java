package interfaces;

public interface I1 {
	//abstract methods
	void m11();
	void m12();
	//static method
	public static void  methodstatic()
	{
		System.out.println("in static method 31");
	}
	
	//default method
	default int m31(int x) 
	{
		System.out.println("in default method I1"); 
		return x+10;
		
	}
}
