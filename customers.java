/*
Devon Smith
Assignemnt "Customers Program"
This program will calculate the ending monthly balance for an account at the "Java Department Store."
It will collect information from the account holder including the account number, the account's beginning balance, the charges and credits to the account and the available credit limit.
It will then use those values to determine the ending balance and remaining credit available to the account holder.
If the account holder has gone over the monthly budget, it will issue a warning to them.
*/

import java.util.Scanner;

public class customers
{
	public static void main (String [] args)
	{
		//declare variables
		int accNum;
		double begBal, charges, credits, creditLimit, endBal, remainCredit, overlimit;
		
		Scanner sc = new Scanner(System.in);
		
		//Introduction
		System.out.println("Welcome to the Java Department Store's Account information System.");
		//Ask for and store account information:
		//account #
		System.out.println("Please enter your account number:  ");
		accNum = sc.nextInt();
		
		//beginning balance
		System.out.println("Enter your beginning balance for the month:  ");
		begBal = sc.nextDouble();
		
		//credit limit
		System.out.println("Enter your account's credit limit:  ");
		creditLimit = sc.nextDouble();
		
		//charges
		System.out.println("Enter ammount of new charges for the month:  ");
		charges = sc.nextDouble();
	
		//credits/payements
		System.out.println("Enter amount of any payments/credits made this month:  ");
		credits = sc.nextDouble();
		
		//calculate ending balance
		endBal = begBal + (charges - credits);
		
		/ /output account # and ending balance
		System.out.printf("The ending balance for account $%d is %.2f\n\r", accNum, endBal);
		
		//if ending balance > credit limit, output credit limit and tell them they have exceeded it.
		if (endBal > creditLimit)
		{
		  overlimit = endBal - creditLimit;
		  System.out.printf("You have exceeded your credit limit by $%.2f!\n\r" , overlimit);
		  System.out.printf("Your Credit limit was: $%.2f\n\r", creditLimit);
		}
		
		//otherwise calcualte and print available credit
	
		else
		{
			remainCredit = creditLimit - endBal;
			System.out.printf("The remaining credit for the account is $%.2f\n", remainCredit);
		}
		
	}
}