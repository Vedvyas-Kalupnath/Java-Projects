import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("Enter First String: ");
		 String string1 = new String(keyboard.nextLine()); 
		 System.out.println("Enter Second String: ");
		 String string2 = new String(keyboard.nextLine()); 
		
	  System.out.println("________________________________ ");
	        // Comparing for String 1 != String 2 
	        System.out.println("Comparing " + string1 + " and " + string2  + " : " + string1.equalsIgnoreCase(string2)); 
	  
		

	}

}
