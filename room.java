/*Devon Smith
Exercize "room 3D"
This program will ask the user to input the three dimentions of a room. 
The inputs will be saved to variables. With those inputs, the program will caclulate the area and perimiter of the room. area, by multiplying the length * width * hight and the perimeter by adding the length + width  + height. It will also calculate the rooms surface area and volume.
It will then print out the area and the perimeter, surface area, volume-- to the screen for the user to view.
*/

import java.util.Scanner;

public class room
{
	public static void main(String[] args)
	{
		/* define the variables*/
		double length, width, height, area, perimeter, surfaceArea, volume;
		Scanner sc = new Scanner(System.in);
		
		/* prompt the user to input room length*/
		System.out.print("Please enter the length of the room:  ");
		
		/*save the input as a variable*/
		length = sc.nextDouble();
		
		/* prompt the user to input room width*/
		System.out.print("Please enter the width of the room:   ");
		/*save the input as a variable*/
		width = sc.nextDouble();
		
		/* prompt the user to input room height*/
		System.out.print("Please enter the height of the room:  ");
		/*save the input as a variable*/
		height = sc.nextDouble();
		
		/*using the saved variables, perform calculations*/
		area = length * width;
		perimeter = length*2 + width*2;
		surfaceArea = (length * width)*2 +(width * height)*2 + (length * height)*2;
		volume = length*width*height;
		
		System.out.printf("The room's area = %.4f\n", area);
		
		System.out.printf("The room's perimeter = %.4f\r\n", perimeter);
		
		System.out.printf("The room's surface area = %.4f\r\n", surfaceArea);
		
		System.out.printf("The room's volume = %.4f\r\n", volume);
		
	}
}