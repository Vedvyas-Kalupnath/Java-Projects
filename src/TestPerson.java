import java.util.Scanner;

/**
 * 
 */

/**
 * @author 
 *
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String nid, name;
		char gender;
		int height,weight;
		
		int i=5;
		
		Person[]person = new Person[i];
		
		for (i=0; i<5; i++)
		{
			
			System.out.println("Enter details of person " + (i++));
			
			System.out.println("ID is:");
			nid = keyboard.nextLine();
			
			System.out.println("Name is:");
			name = keyboard.next();
			
			System.out.println("Gender is:");
			gender = keyboard.next().charAt(0);
			
			
			System.out.println("Height is:");
			height = keyboard.nextInt();
			
			System.out.println("Weight is:");
			weight = keyboard.nextInt();
			
			person[i] = new Person(nid,name,gender,height,weight);
			
			
			
		}
		
		
		for (int a= 0; i<5; i++)
		{
			System.out.println("Name:");
			//System.out.println(person[a].getname(i));
		}
		

	}

}
