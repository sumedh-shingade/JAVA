package Person;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			
			System.out.println("1. Add new member\n 2. display\n 3.calculate marks\n 4.exit  ");
			System.out.println("Choice : ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. PHD Student\n 2.Master Student");
				
				int ch=sc.nextInt();
				PersonService.addNewData(ch);
				
				break;
				
		case 2:
			PersonService.displayall();

//			case 3:
//				break;
//			case 4:
//				System.out.println("Thank you ");
//				break;
			default:
				sc.close();
				System.out.println("wrong choice");
			}
		}while(choice!=4);
	}
}
