/*
Devon Smith
Year Program

*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class year
{
	public static void main(String[] args)
	{
		//declare variables for main
		int month, day, year;
		long longDate;
		String dateStr;
		Scanner sc = new Scanner(System.in);
		
		//open dialogue box to prompt for date input
		dateStr = JOptionPane.showInputDialog("Enter the Date (format: mm dd yyyy): ");
		//save date as variables
		month = sc.nextInt();
		day = sc.nextInt();
		year = sc.nextInt();
	    
	    System.out.print("year is " + year);
		
		//print out the long date
		
		longDate = convertdays(month, day, year);
		System.out.print("The long date is: " + longDate);
		
		//print out if the year is a leap year or not
		if (leap(year) == true)
		  System.out.print(year + " is a leap year.");
		else
		  System.out.print(year + " is not a leap year.");
	}
	
	public static long convertdays(int m, int d, int y)
	{
		long longM, longY, longFinal;
	    
	    longM = m * 100;
	    longY = y * 10000;
	    longFinal = longM + d +longY;
	    System.out.print("in convert days");
	
		return longFinal;
	}
	
	public static boolean leap(int yr)
	{
		
		if ((yr/400 == 0) || (yr/4 ==0) && (yr/400 != 0))
		  return true;
		else
		  return false;
	}
}