/*Devon Smith
Exercize 2-9
This program will calculate the rate of change P / B = R
*/

import java.util.Scanner;
public class ex29
{
	public static void main(String[] args)
	{
		double sales1, sales2, ratechange;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter period 1 sales:  ");
		sales1 = sc.nextDouble();
		System.out.print("Enter period 2 sales:  ");
		sales2 = sc.nextDouble();
		ratechange = (sales2 - sales1) / sales1*100;
		System.out.printf("Rate of change is %.2f%%\n", ratechange);
		
	}
}