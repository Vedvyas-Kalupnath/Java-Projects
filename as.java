import java.util.Scanner;

public class as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0;
		int num =0;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter n:");
		int N= keyboard.nextInt();
		String primeNumbers = "";
		for (i = 1; i <= N; i++)
		{
		int counter=0;
		for(num =i; num>=1; num--)
		{
		if(i%num==0)
		{
		counter = counter + 1;
		}
		}
		if (counter ==2)
		{
		primeNumbers = primeNumbers + i + " ";
		}
		}
		System.out.println("Prime numbers between 1 and "+ N +" are :");
		System.out.println(primeNumbers);
	}

}
