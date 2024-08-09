package javaAssignment;

import java.util.Scanner;

public class Greatest_Num {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Numbers");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b&&a>c)
		{
		System.out.println("max is:"+a);
		}
		else if (b>a&&b>c)
		{
			System.out.println("max is:"+b);
		}
		else
		{
			System.out.println("max is:"+c);
		}
	}

}
