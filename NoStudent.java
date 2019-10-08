import java.util.Scanner;

/**
 * 
 */

/**
 * @author 
 *
 */
public class NoStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Write a program to ask the user:
			- number of students in a class
			- create an array based on the size of the class
			- calculate and display the minimum, maximum and average marks of the class
			- then ask the user if he/she wants to execute the program again. */ 

		
		 boolean loop;
		 
		 
		while (loop = true)
		{
		
		
		

		 int n, sum = 0,min=99999,max=0;
	        float average;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter marks(out of 100) for all students one by one: ");
	        for(int i = 0; i < n ; i++)
	        {
	            a[i] = s.nextInt();
	            
	            sum = sum + a[i];
	            
	            for(int j = 0; j < n ; j++)
	            {
	            if (a[i]<min)
	            {
	            	min=a[i];
	            	
	            	break;
	            	
	            	
	            	
	            }
	            
	            
	            else if (a[i]>max)
	            {
	            	max=a[i];
	            	
	            	
	            	break;
	            	
	            }
	           
	            }
	            
	           
	        }
	        
	        System.out.println("Minimum mark is: " + min);
            System.out.println("Maximum mark is: " + max);
	        System.out.println("Sum of marks of "+n +" student in the class is:"+sum);
	        average = (float)sum / n;
	        System.out.println("Average mark of class is: "+average);
	        
	        
	        System.out.println("Do you want to continue?press 'n' or any key to continue");
	        char choice = s.next().charAt(0);
	        if (choice == 'n') {
	        	break;
	        	
	        	}
	        		
	        
	        
		}    

	}

}
