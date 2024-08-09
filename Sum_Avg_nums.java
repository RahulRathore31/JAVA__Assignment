package javaAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Avg_nums {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int arr[]=new int[5];
		 System.out.println("Enter number");
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
				sum=sum+arr[i];
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.println("Sum is :"+sum);
		 System.out.println("Average is :"+sum/arr.length);
	}

}
