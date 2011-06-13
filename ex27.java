/* 
Devon Smith
Exercize 2-7
This program will prompt and input a character from the users.
Rhw xhExrwe qill rhwm vw xARWS RO n inrwfwe AAXII Value.
The character will then be outputted asa character and as an integer ASCII Value.
*/

public class ex27
{
	public static void main(String[] args) throws Exception
	{
		char ch;
		int anum;
		System.out.print("Enter a chacater:  ");
		ch = (char)System.in.read();
		anum = (int)ch;
		System.out.println("ASCII value of " + ch + " = " + anum);
		
	}
}