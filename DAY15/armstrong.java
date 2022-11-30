  Question : Write a program to identify if the number is Strong number or not
                 
                             SOURCE CODE
                             
  import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int fact=1,sum=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = obj.nextInt();
		int k = n;
		while(n>0)
		{
		    int  m = n%10;
		    while(m>0)
		    {
		        fact = fact*m;
		        m--;
		    }
		    sum=sum+fact;
		   n=n/10; 
		}
		if(sum==k)
		System.out.println("the  number is armstrong");
		else
		System.out.println("not armstrong");
	}
}

                              OUTPUT
Enter the number
121
not armstrong                           
