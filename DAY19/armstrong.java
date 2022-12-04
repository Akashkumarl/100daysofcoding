Question   :  Write a program to identify if the number is Armstrong number or not

                              SOURCE CODE
                              
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,count=0,sum=0,k,n,p;
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int m  =obj.nextInt();
		k=m;
		n = m;
		while(k>0)
		{
		    count++;
		    k/=10;
		}
		while(m>0)
        {   p  = m%10;
		    sum +=(Math.pow(p,count));
		    m=m/10;
		}
		if(sum==n)
		    System.out.println("Armstrong number");
		else
		    System.out.println("not armstrong");
	}
}

                             OUTPUT
enter the number
153
Armstrong number                              
