
Question :Write a program to identify of the a number is positive or negative


                        SOURCE CODE
                        
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter the number");
	int a = obj.nextInt();
	    if(a>0)
	           System.out.println("positive number");
	    else if(a<0)
	           System.out.println("negative number");
	    else
	    System.out.println("neither positive nor zero");
	}
}
                        
