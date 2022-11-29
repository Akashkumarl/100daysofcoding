Question : Write a program to reverse a given number


                   SOURCE CODE
                   
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,rev=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");
		int m = obj.nextInt();
        while(m!=0)
        {
        n= m%10;
        rev = (rev*10) + n;
        m = m/10;
        }
        System.out.println("The reverse is "+rev);
		
	}
}

                             OUTPUT
enter the number
345
The reverse is 543                   
