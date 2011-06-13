/* Devon Smith
Exercize 2-4
This program will calculate miles per gallon
*/

import java.util.Scanner;

public class ex24
{
	public static void main(String[] args)
	{
		double miles, gallons, mpg;
		Scanner sc = new.Scanner(System.in);
		
		/*enter variables*/
		
		System.out.print("Enter Miles:  ");
		sc.nextDouble();
		miles = sc.nextDouble();
		System.out.print("Enter Gallons:  ");
		
		mpg = miles / gallons;
		
		System.out.printf("Miles per gallon is %f\n" , mpg);
		/*the %f means print out as a float*/
	}
}

/* */