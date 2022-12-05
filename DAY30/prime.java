Question : Write a program to identify if the number is Prime number or not

                         SOURCE CODE
                         
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int count=0,i;
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int n = obj.nextInt();
		outer:
		{ for(i=1;i<=n;i++)
		 {
		     if(n==1)
		     {System.out.println("neither prime nor composite");
		     break outer;
		     }
		    if(n%i==0)
		    count++;
		 }
		if(count==2)
		{
		    System.out.println("prime number");
		}
		else
		  System.out.println("not prime number");
		}
		
	}
}

                               OUTPUT
enter the number
17
prime number                         
