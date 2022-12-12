Question: Write a program to find the double of the given number without using arithmetic operator

                                    SOURCE CODE
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i;
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int n = obj.nextInt();
		int b = n;
		for(i=0;i<n;i++)
		{
		    b++;
		}
		System.out.println(b);
}  }

                                 
                                   OUTPUT
enter the number
4
8                                    
