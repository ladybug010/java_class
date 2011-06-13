/* Devon Smith
Exercize 2-6b
This program converts gallons to liters. There are 3.7854 liters in a gallon.
*/

import java.util.Scanner;
public class ex26b
{
	public static void main(String[]args)
	{
		//declare variables
		double gallons, liters;
		Scanner sc = new Scanner(System.in);
		
		//prompt user
		System.out.print("How many gallons do you have? ");
		
		//input from user
		gallons = sc.nextDouble();
		
		//calculation
		liters = gallons * 3.7854;
		
		//output results
		System.out.print( gallons +" gallons = " + liters + " liters");
		
	}
}
