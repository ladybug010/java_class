/*
Devon Smith
Exercise 3-2
This program will calculate pay with time and a half for hours over 40
*/

import java.util.Scanner;

public class ex32
{
	public static void main(String[] args)
	{
		//set variables
		double hours, rate, pay;
		Scanner sc = new Scanner(System.in);
		
		//ask for and store input for hours and rate
		System.out.print("Enter hours worked:  ");
		hours = sc.nextDouble();
		System.out.print("Enter your hourly rate:  ");
		rate = sc.nextDouble();
		
		if (hours > 40)
		{
		  pay = 40 * rate + (hours-40) * rate * 1.5;
		  System.out.println("You have OT pay");
		}
		else
		  pay = hours * rate;
		  System.out.printf("Your weekly pay is $ %.2f\n", pay);
		
	}
}