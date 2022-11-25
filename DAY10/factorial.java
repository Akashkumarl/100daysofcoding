Question : Write a program to find Factorial of a number


                            SOURCE CODE
                            
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int mul=1;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = obj.nextInt();
		if(n==0)
		{
		    System.out.println("The factorial is 1");
		}
		else
		  {
		      while(n!=0)
		      {
		          mul = mul*n;
		          n--;
		      }
		      System.out.println("the factorial is "+mul);
		  }
	}
}

                              OUTPUT
Enter the number 
4
the factorial is 24                            
