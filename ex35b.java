/*
Devon Smith
Exercize 3-5b
This program will input 1 integer and determine if it is odd or even
*/

import java.util.Scanner;
public class ex35b
{
	public static void main(String[] args)
	{
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num1 = sc.nextInt();
		
		if (num1 % 2 == 0)
		  System.out.println(num1 + " is an even number");
		
		else
		  System.out.println(num1 + " is not an even number"); 
	}
}