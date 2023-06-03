package Person;

public class Master extends Student
{
	private int m4,m5,sp_c_marks;
	
	
	public Master()
	{
		super();
	}
	
	public Master(String pid,String pname,String pmob,int m1,int m2,int m3,int m4,int m5,int sp_c_marks){
		super(pid,pname,pmob,m1,m2,m3);
		this.m4=m4;
		this.m5=m5;
		this.sp_c_marks=sp_c_marks;
		}
	
	public String toString() {
		return super.toString()+"Subject 4: " +m4+ "  Subject 5 :"+m5+"Special Course Marks :"+sp_c_marks;
	}


}


