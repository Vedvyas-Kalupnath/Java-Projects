import java.util.Scanner;

/**
 * 
 */

/**
 * @author Asus
 *
 */
public class Wage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a simple Java program to calculate and display salary of an employee
		 * based on the following: 
		 * • ask user to input number of hours worked 
		 * • salary =hours worked * rate of pay
		 * • if the employee has worked more than 40 hours then the additional hours are worth 50% more than his normal rate of pay
		 */
		
		
		
		System.out.println("Program to calculate and display salary of an employee");
		
		double hoursWorked;
		double rate;
		double normalSal;
		double overtime;
		double salary;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter hours of work: ");
		hoursWorked = keyboard.nextDouble();
		
		System.out.print("Enter rate of pay: Rs");
		rate = keyboard.nextDouble();

		if (hoursWorked > 40)

		{
			normalSal=(40*rate); 
			overtime = (((hoursWorked-40)*(.5*rate)) + ((hoursWorked-40)* rate) );
			
			
			salary= (overtime + normalSal);
			
			System.out.println("Your overtime is: Rs" + overtime + " and your salary is:Rs " + salary);
		
		
		}
		
		else 
		{
			salary = (rate*hoursWorked);
			
			System.out.println("Your salary is:" + salary);
			
			
		}	
		
			
	
		
		
		
	}

}
