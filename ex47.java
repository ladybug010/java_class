/*
Devon Smith
Exercise 4-7
This program will calculate a total price of different items
*/
import java.util.Scanner;
public class ex47
{
	public static void main(String[] args)
	{
		int prod, qty;
		double price, total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter product #1-5 (-1 to end):  ");
		prod = sc.nextInt();
		
		while(prod != -1)
		{
			switch (prod)
			{
				case 1:
				  System.out.print("Enter quantity for product #1:  ");
				  qty = sc.nextInt();
				  price = qty * 4.50;
				  break;
				
			    case 2:
				   System.out.print("Enter quantity for product #1:  ");
				   qty = sc.nextInt();
				   price = qty * 9.98;
				   break;
				
			     case 3:
				    System.out.print("Enter quantity for product #1:  ");
					qty = sc.nextInt();
					price = qty * 9.98;
					break;
						
				  case 4:
					System.out.print("Enter quantity for product #1:  ");
				    qty = sc.nextInt();
				    price = qty * 4.99;
					break;
					
				  case 5:
					System.out.print("Enter quantity for product #1:  ");
					qty = sc.nextInt();
					price = qty * 6.87;
					break;
					
				  default:
				    System.out.println("Invalid product #");
				    price = 0;
				
			}
				total += price;
				
				System.out.printf("\n Total price for all items is %.2f \n\r", total);
					
		}
	}
}