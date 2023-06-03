package Person;

import java.util.Scanner;
public class PersonService {
	private static Person[] perarr;
	private static int count;
	
	static {
		perarr=new Person[10];
		count=0;
	}
	
	public static void addNewData(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String pname=sc.next();
		System.out.println("enter mob");
		String pmob=sc.next();
		
		if(ch<3) {
			
			//accept students details
			System.out.println("enter m1");
			int m1=sc.nextInt();
			System.out.println("enter m2");
			int m2=sc.nextInt();
			
			System.out.println("enter m3");
			int m3=sc.nextInt();
			
		if(ch==1) {
		
			System.out.println("enter thesis name");
			String thesis=sc.next();
			System.out.println("enter sp_sub marks");
			int sp_marks=sc.nextInt();
			perarr[count]=new PhdStudent("p", pname, pmob, m1, m2, m3,thesis,sp_marks);
		}
		
		else {
			
			System.out.println("enter sp_sub marks");
			int sp_c_marks=sc.nextInt();
			System.out.println("enter m4 marks");
			int m4=sc.nextInt();
			System.out.println("enter m5 marks");
			int m5=sc.nextInt();
			perarr[count]=new Master("m", pname, pmob,m1,m2,m3,m4,m5,sp_c_marks);	
			
		}
		}}
		
		public static void displayall()
	
		{
			for(int i=0;i<perarr.length;i++) {
			System.out.println(perarr[i]);	
				
			}
		}
		
		
		
		
		
	
}
