package service;

import beans.SpeedOutOfRangeException;


public class ValidationRules {
//define speed limits
	public static final int min_speed;
	public static final int max_speed;
	static {
		System.out.println("in static block");
		min_speed=30;
		max_speed=80;
	}
	
	//add static method for speed validation
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed<min_speed)
			throw new SpeedOutOfRangeException("you are too slow");
		if(speed>max_speed) 
			throw new SpeedOutOfRangeException("you are driving fast");
				System.out.println("speed is in range");
			}
}
