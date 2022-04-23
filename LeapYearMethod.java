import java.util.Scanner;

/**
 * @author Arash
 *
 *Refer to in class exercise 4, modify the code so that you will use a method to 
 *determine if a year is a leap year or not. The method signature is as follows:
 *static boolean isLeapYear(int year)
 *Modify your main program to invoke the method isLeapYear() 
 *appropriately so the program functions exactly same as in class exercise 4.  
 *
 */
public class LeapYearMethod 
{
	public static void main(String[] args) 
	{		
		while (true)
		{
			//takes the user input
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter a year: (0 to stop) ");
			int year = keyboard.nextInt();
			
			//check if the loop needs to break
			if (year == 0)
			{
				System.out.println("Bye.");
				break;
			}
			
			if (isLeapYear(year))
				System.out.println(year + " is a leap year!");
			else
				System.out.println(year + " is NOT a leap year!");
		}
	}
	
	static boolean isLeapYear(int year)
	{
		boolean flag; //true for leap year
		
		//check leap year
		if (year%4 != 0)
			flag = false;
		else if (year%100 != 0)
			flag = true;
		else if (year%400 != 0)
			flag = false;
		else 
			flag = true;
		
		return flag;
	}
}
