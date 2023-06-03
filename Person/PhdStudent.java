package Person;

public class PhdStudent extends Student
{
	private String thesis;
	private int sp_marks;
	
	public PhdStudent()
	{
		super();
	}
	
	public PhdStudent(String pid,String pname,String pmob,int m1,int m2,int m3,String thesis,int sp_marks)
	{
		
		super(pid,pname,pmob,m1,m2,m3);
		this.thesis=thesis;
		this.sp_marks=sp_marks;
	}
	
	public String toString()
	{
		return super.toString()+"Thesis :"+thesis+"Special Marks :"+sp_marks;
	}
}
