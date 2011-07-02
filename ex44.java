/*
Devon Smith
Exercise 4-3
This program will find a factoral
*/

import java.util.Scanner;
public class ex44
{
	public static void main(String[] args)
	{
		int i, t;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("What factoral do you want?");
		t = sc.nextInt();
		
		for (i = 1; i <=t; i++) //starts at 1, count up until greater than 10, count up by 1.
		  fact *= i;
		System.out.println( t + " Factoral = " + fact);
		
	}
}