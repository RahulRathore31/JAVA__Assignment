package javaAssignment;

import java.util.Scanner;

public class Vowel_or_Constant {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a char:");
		String input = s.nextLine();
		if (input.length()!=1)
		{
			System.out.println("Error! enter only one char...");
			return;
		}
		char character=input.charAt(0);
		if(!Character.isAlphabetic(character))
		{
			System.out.println("Error! you entered wrong choice...");
			return;
		}
		character = Character.toLowerCase(character);
		if (character=='a'||character=='i' || character=='o' ||character=='u' ||character=='e' )
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}