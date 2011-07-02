/*
Devon Smith
This program will calculate several salaries based upon commission -
input sales, calculate and output salary- $200 base salary + 9% of the sales amount
*/

import java.util.Scanner;
public class ex310
{
	public static void main(String[] args)
	{
		//declare variables
		double sales, commission, salary;
		Scanner sc= new Scanner(System.in);
	
		//input sales
		System.out.println("input the dollar amount of sales earned:(enter -1 to exit)  ");
		sales = sc.nextDouble();
		
		while (sales != -1)
		{
		  //calculate commission and salary
		  commission = sales * .09;
		  salary = 200 + commission;
		
		  //output salary + commission
		  System.out.printf("The monthly salary is $%.2f \n" , salary);
		
		System.out.println("input the dollar amount of sales earned:(enter -1 to exit)  ");
		sales = sc.nextDouble();
	    }
	}
}