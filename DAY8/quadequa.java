Question  : Write a program to find roots of a quadratic equation


                              SOURCE CODE
                              
import java.util.*;
import java.lang.*;
public class Main

{ 
	public static void main(String[] args) {
	    double root1,root2;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the values of a,b and c");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c = obj.nextInt();
		 int determinant = b*b-(4*a*c);
		if(determinant>0)
		{
		     root1=-b+Math.sqrt(determinant)/(2*a);
		     root2 = -b-Math.sqrt(determinant)/(2*a);
		    System.out.println("The roots are %.2f and %.2f"+root1+root2);
		}
		if(determinant ==0)
		{
		    root1=-b/(2*a);
		    root2=-b/(2*a);
		    System.out.println("The roots are equal\n"+root1);
		}
		if(determinant<0)
		{
		     double real = -b / (2 * a);
      double imaginary =Math.sqrt(-determinant) / (2 * a);
      System.out.println("root1 = %.2f+%.2f"+ real+ imaginary);
      System.out.println("\nroot2 = %.2f-%.2f"+ real+ imaginary);
		}
	}
}


                                             OUTPUT
enter the values of a,b and c
1
-6
9
The roots are equal
3.0
                
