import java.util.Scanner;

/**
 * 
 */

/**
 * @author Asus
 *
 */
public class Leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
	      System.out.println("Enter a year : ");
	      Scanner keyboard = new Scanner(System.in);
	      year = keyboard.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(year + " is a leap year");
	      else
	         System.out.println(year +" is not a leap year");

	}

}
