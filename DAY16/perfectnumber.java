Question :  Write a program to identify if the number is Perfect number or not

                            SOURCE CODE
  
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    int i=1,sum=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = obj.nextInt();
		while(i<=n/2)
		{
		    if(n % i==0)
		    {
		       sum=sum+i; 
		    }
		    i++;
		}
		if(n==sum)
		{
		    System.out.println("perfect number");
		}
		else
		{
		    System.out.println("not a perfect number");
		}
	}
}

                           OUTPUT
Enter the number
28
perfect number  
