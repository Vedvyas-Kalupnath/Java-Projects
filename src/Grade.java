/**
 * 
 */
import java.util.*;
/**
 * @author Asus
 *
 */
public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade, category;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a grade (0 to 100):");
		grade = keyboard.nextInt();
		category = grade / 10;
		switch (category) {
		case 10: case 9:
		System.out.println ("excellent.");
		break;
		case 8:
		System.out.println ("nice job.");
		break;
		case 7:
		System.out.println ("average.");
		break;
		case 6:
		System.out.println ("below average.");
		break;
		default:
		System.out.println ("problem.");
		}
		

	
		}
	}


