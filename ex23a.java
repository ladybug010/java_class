/*
Devon Smith
exercize 2-3a
This program will input a number 1-12 and multiply by 97-12
*/

import java.util.Scanner;
public class ex23a
{
	//initialize program
	public static void main(String[] args)
	{
		//save spot for the variables
		int num, prod, x = 97;
		//set up scanner
		Scanner sc = new Scanner(System.in);
		
		//print out the prompt and save it as num
		System.out.print("Enter a number 1-12:  ");
		num = sc.nextInt();
		
		//do calculations
		prod = num * x;
		
		//print out result
		System.out.printf("%2d * %2d = %4d\n", num, x, prod);
		
		//increment shortcut- changes value for x ( x = 8)
		x++;
		
		//new cacluations
		prod = num * x;
		
		// print out new results
		System.out.printf("%2d * %2d = %4d\n", num, x, prod);
		
		//increment shortcut- changes value for x (x = 9)
		x++;
		
		//new cacluations
		prod = num * x;
		
		// print out new results
		System.out.printf("%2d * %2d = %4d\n", num, x, prod);
		
		//increment shortcut- changes value for x (x = 10)
		x++;
		
		//new cacluations
		prod = num * x;
		
		// print out new results
		System.out.printf("%2d * %3d = %3d\n", num, x, prod);
	}
}