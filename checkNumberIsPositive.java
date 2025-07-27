package week1.day2;

import java.util.Iterator;

public class checkNumberIsPositive {
	
	public static void main(String[] args) {
	
		//As per the initial understanding
		int version= 10;
		
		if (version>=0) {
			
			System.out.println("Number is positive "+ " " +version);
			
		}
		//Tired to use if else with -1 to 10  range
		
		int ver =-1;
		 for (ver=-1;ver <= 10;ver++) {
			 if (ver>=0) {
				  System.out.println("Number is positive" +" "+ ver);			
				  }
			 
			 else
			 {
				 System.out.println("Number is negative");
			 }
			 
			 for (String string : args) {
				
				
			}
		 }
		
		
	}

}
