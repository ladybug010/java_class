/*
Devon Smith
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ladder
{
	static public void main(String[] args)
	{
	//declare variables
	int ladderQ, angle, ladderSize;
	double rad, height, dist, distSQ;
	
	//open dialoague and prompt user for answer
	ladderQ = 
	 JOptionPane.showConfirmDialog(null,
	    "Do you need a ladder?",
	     "Ladder Selector",
	        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
	
	//if no open an Informaiton message box and inform the user that they have not selected a ladder.
     if (ladderQ == JOptionPane.NO_OPTION)
	   {
		JOptionPane.showMessageDialog(null, "You have not chosen to select a ladder", "No ladder", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	    }
	
	 else
	  {
		/*if yes, place a random sized ladder at a random angle against the house, using the random number
		generator in the math class, and adding values to put in in the correct range.*/
		
		ladderSize = 15 +(int)(Math.random() * (25-15));
		System.out.println("The size of ladder is: " + ladderSize);
		
		angle = 60 + (int)(Math.random()*(75-60));
		System.out.println("The angle of the ladder against the house is: " + angle);
		 
		//convert degrees to radians
		rad = Math.toRadians((double)angle);
		System.out.printf("The radian of the angle is %.1f\n", rad);
		
		//calculate height of the ladder against the house
		height = (Math.sin(rad))*ladderSize;
		
		System.out.printf("The height of the ladder up the house is %.1f\n", height);
		
		//calculate the distance of the ladder from the house.
		distSQ = (Math.pow(ladderSize, 2) - Math.pow(height, 2));
		
		dist = Math.sqrt(distSQ);
		System.out.printf("The distance of the base of the ladder from the house is %.1f\n ", dist);
	
	  }
	  
  }
}