/*
Devon Smith
Slugging Percentages Sentinel Loop
This program will determine the slugging percentages for several NY Yankees from the 2006 season.
It will do this by dividing the total number of bases by the number of at bats given stats from each player.
So long as the user does not input the sentinel, the program will enter the while loop collect all the other stat information and perform the calculations. It will print out the player's name and average (to three decimal places) and continue through the loop again until the sentinel is entered.
*/
import java.util.Scanner;

public class slug
{
	public static void main(String [] args)
	{
		//declare variables
		double slug, bases, bats;
		int single, doub, triple, homeRun;
		String name;
		Scanner sc = new Scanner(System.in);
		
		//prompt user for name, set sentinel
		System.out.println("To calculate the 2006 slugging percentage for a NY Yankees, please enter a player's name (-1 to exit)");
		name = sc.nextLine();
		System.out.println();
		
		//enter loop if sentinel is not present
		while (!name.equals("-1"))
		{
			//prompt for other stat information
			System.out.println("Enter the number of Singles for " + name);
			single = sc.nextInt();
			System.out.println();
			
			System.out.println("Enter the number of Doubles for " + name);
			doub = sc.nextInt();
			System.out.println();
				
			System.out.println("Enter the number of Triples for " + name);
			triple = sc.nextInt();
			System.out.println();
					
			System.out.println("Enter the number of Home Runs for " + name);
			homeRun = sc.nextInt();
			System.out.println();
			
			System.out.println("Enter the number of At Bats for " + name);
			bats = sc.nextDouble();
			System.out.println();
			
			//perform calculations
			bases = (4 * homeRun) + (3 * triple) + (2 * doub) + single;
			
			slug = bases / bats;
			
			//output players name and average

			System.out.printf("The 2006 slugging percentage for %s is: %.3f\n\r", name , slug);
			System.out.println();
			
			System.out.println("Please enter another player's name (-1 to exit):");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println();
			
		}
		  
	}
}
