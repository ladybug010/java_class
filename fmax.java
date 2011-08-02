/*
Devon Smith
FMAX array program
*/

import java.util.Scanner;

public class fmax
{
	public static void main(String[] args)
	{
		int [] = fmax [13];
		int max, min, indexMax,indexMin, i;
		
		fmax = getInt(fmax) // prompt user for array data
		
		printArray(fmax);//lined up in columns
		
		//print from main with min/max/index values
		System.out.print("The maximum value is: " + max);
		System.out.print("This is index number " + indexMax + " in the list of numbers.");
		
		System.out.print("The minimum value is: " + min);
		System.out.print("This is index number " + indexMin + " in the list of numbers.");
		
	}
	
	public static void getArray(int[] f)
	{
		int i=0, min, max, minIndex, maxIndex;
		 for(i=0; i< f.length; i++)
		{
			//prompt user for integer input, get 13 of them.
		    System.out.print("Enter integer:  ");
			 f[i] = sc.nextInt();
			
			
// now figure out which is the min value and which is the max value
             minIndex = pass;
                for (j = pass+1; j<N; j++)
                   if (ch[j] < ch[minindex])
                     minindex =1;  
		}
		 return min, max, minIndex, maxIndex;
	}
	
	public static void printArray(int [] f)
	{
			int e;
			System.out.println("\r\tIndex#\t\tArray Value");
			
		  	for (e=1; e < f.length; e++)
			  System.out.printf("%13d%10d\r", i, f[i]);
			System.out.println();
	}
}