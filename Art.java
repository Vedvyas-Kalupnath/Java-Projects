import java.util.Scanner;

public class Art {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows, r, i;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		numRows = keyboard.nextInt();
		for (r=1; r<=numRows; r++)
		{
			for (i=1; i <= numRows-r; i++)
				System.out.println(" ");
			
			for(i=1; i <= r; i++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
