package javaAssignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter year");
		int year = s.nextInt();
		
		if (isLeapYear(year)) 
		{
		 System.out.println(year+"is a leap year");	
		}
		else 
		{
		System.out.println(year+"is not a leap year");
		}
	}

	    static boolean isLeapYear(int year) {
		if (year % 4==0)
		{
			if(year % 100==0)
			{
				return year % 400==0;
			}
			else 
			{
				return true;
			}
		}
		return false;
	}

}
