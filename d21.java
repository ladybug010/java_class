/*Devon Smith*/

import java.util.Scanner;
public class d21
{
	public static void main(String[] args)
	{
		double num, cube;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer:  ");
		num = sc.nextDouble();
		cube = num * num*num;
		System.out.println("Cube of " + num + " is " + cube);
	}
		
}
