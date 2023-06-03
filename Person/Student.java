package Person;
public class Student extends Person 
{
	protected int m1,m2,m3;
	
	public Student()
	{
		System.out.println("it is default constructor");
	}
	public Student(String pid,String pname,String pmob,int m1,int m2,int m3)
	{
		super(pid,pname,pmob);
		this.m1=m1;
		this .m2=m2;
		this.m3=m3;
	}
	
	public String toString()
	{
		return super.toString()+ "Subject 1: " +m1+ "  Subject 2 :"+m2+ "   Subject3:"+m3; 
	}

}
