Question  :Write a program to find Number of digits in an integer


                          Source Code

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int count=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int m = obj.nextInt();
		while(m!=0)
		{int n = m%10;
		 count = count+1;
		m=m/10;
		}
		System.out.println("the number of digits are  "+count);
	}
}



           OUTPUT
enter the number
12
the number of digits are  2           
