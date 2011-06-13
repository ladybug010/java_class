/*
Devon Smith
Exercize 3-1
This program will calculate an average and give a message
*/

import java.util.Scanner;
public class ex31
{
	public static void main(String [] args)
	{
		int grade1, grade2;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 grades:  ");
		grade1= sc.nextInt();
		grade2= sc.nextInt();
		avg = (grade1 + grade2) / 2.0;
		System.out.printf("Your average is % 2f\n" , avg);
		
		  if (avg >= 89.5)
		    System.out.println("Great!");
		
		  else if (avg <= 89.5)
		    System.out.println("Work Harder");
		
		  else
		    System.out.println("Please enter two valid integers");
		
		System.out.println("java is fun");
		
	}
}