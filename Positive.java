import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n,sum=0,avg;
          
          Scanner sc=new Scanner(System.in);

          System.out.println("enter how many numbers you want :");
           n=sc.nextInt();
           int a[]=new int[n]; 
           System.out.println("enter the "+n+" numbers: ");
           for(int i=0;i<n;i++)
           {      
         System.out.println("enter  number  "+(i+1)+":");
                   a[i]=sc.nextInt();
                   if (a[i]<0) {
                	   break;
                   }
           }
           for(int i=0;i<n;i++)
           {
                   sum+=a[i];
                   
           }  	    
           System.out.println("Average of numbers is: " + (sum/n));                  
      	}

	

}


