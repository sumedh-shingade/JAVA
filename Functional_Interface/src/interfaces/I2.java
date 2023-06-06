package interfaces;

public interface I2 {
	void m21();
	void m22();
	
	//default method
	default int m31(int x) 
	{
		System.out.println("in default method I2"); 
		return x+10;
		
	}
	

}
