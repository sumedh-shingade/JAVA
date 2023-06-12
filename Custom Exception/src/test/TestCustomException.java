package test;
import java.util.Scanner;
import service.ValidationRules;

import beans.SpeedOutOfRangeException;
import service.ValidationRules;

public class TestCustomException {
public static void main(String[] args) throws SpeedOutOfRangeException {
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("enter the speed");
		validateSpeed(sc.nextInt());
		System.out.println("end of try");
	}
	System.out.println("end of main");
}




}
