Question : Write a program to find Sum of N natural numbers

                 SOURCE CODE
                 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,sum=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = obj.nextInt();
		for(i=1;i<=n;i++)
		{
		    sum=sum+i;
		}
		System.out.println("the sum is "+sum);
	}
}


                   OUTPUT
Enter the number
5
the sum is 15                 
