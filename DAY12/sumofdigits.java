Question   : Write a program to find Sum of digits of a number

                  OUTPUT

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,n,sum=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int m = obj.nextInt();
        while(m!=0)
		{
		    n = m%10;
		    sum=sum+n;
		    m=m/10;
		}
		System.out.println("the sum is"+sum);
	}
}


                                  OUTPUT
Enter the number
1245
the sum is12
