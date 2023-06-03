package Person;

public class Person
{
	private String pid;
	private String pname;
	private String pmob;

	static int count;
	
	static
	{
		count=0;
	}
	
	public Person() {
		
		System.out.println("THis is the person default constructor");
		
	}
	
	public Person(String type)
	{    count ++;
		pid=type+count;
		pname=null;
		pmob=null;	
	}
	
	public Person(String type,String name,String mob)
	{
		count ++;
		pid=type + count;
		pname=name;
		pmob=mob;
	}
	
	public void setID(String id)
	{
		this.pid=id;
	}
	
	public String getID() 
	{
		return pid;
	}
	
	
	public void setPersonname(String name)
	{
		pname=name;
	}
	public String getPersonname()
	{
		return pname;
	}
	
	public void setPersonmob(String pmob) 
	{
		this.pmob=pmob;
	}
	
	public String getPersonmob()
	{
		return pmob;
	}
		
	public String toString() 
	{
		return "ID: "+pid+"\nPerson Name:"+pname+"\nMobile :"+pmob;
	}
	
	
}

