/*
Devon Smith
Exercise 2-8
This program will find the area of an annulus
*/
import java.util.Scanner;

public class ex28
{
	public static void main(String[] args)
	{
		double r1, r2, pi=3.14159, area;
		Scanner sc = new Scanner(System.in);
		
		//collect variable data for R1 and R2
		System.out.print("Enter radius of inner circle: ");
		r1 = sc.nextDouble();
		
		System.out.print("Enter radius of outter circle: ");
		r2= sc.nextDouble();
		
		//do calculations
		area = pi * (r2 * r2 - r1 * r1);
		
		//print information to screen
		System.out.println("Area of annulus = " + area);
		
	}
}