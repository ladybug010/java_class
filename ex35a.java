/*
Devon Smith
Exercize 3-5a
This program will input 2 integers and determine if the first is a multiple of the 2nd.
*/

import java.util.Scanner;
public class ex35a
{
	public static void main(String[] args)
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0)
		  System.out.println(num1 + " is a multiple of " + num2);
		else
		  System.out.println(num1 + " is not a mulitiple of " + num2); 
	}
}