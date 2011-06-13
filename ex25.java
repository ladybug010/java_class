/*exercize 2-5 Convert Fahreheit to Celsius
*/

import java.util.Scanner;
public class ex25

{
	public static void main(String[] args)
	{
		int fah;
		double cel;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer fahreneit temperature:  ");
		fah = sc.nextInt();
		cel = (fah -32) * 5 / 9.0;
		System.out.print(fah + " fahreneit = " + cel + " celsius");
	}
}
