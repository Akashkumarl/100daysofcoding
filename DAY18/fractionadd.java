Question :  Write a program to Add two fractions

                     SOURCE CODE
                     
import java.util.*;
public class Main
{
	public  static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = obj.nextInt();
		System.out.println("Enter the denominator");
	    int b = obj.nextInt();
	    System.out.println("enter the numerator");
		int n = obj.nextInt();
		System.out.println("enter the denominator");
		int m = obj.nextInt();
		fraction(a,b,n,m);
	}
    static void fraction(int a,int b,int n,int m)
{     
     {int x3,y3;
		x3 = (a*m) + (b*n);
		y3 = b*m;
		lowest(x3,y3);
	}
}

    static void lowest(int x3,int y3)
     {int cf=0;
         if(x3%y3==0)
         {
             cf = y3;
             x3 = x3/cf;
             y3 =y3/cf;
             System.out.println(x3+"/"+y3);
         }
         else
         {
             System.out.println(x3+"/"+y3);
         }
         
     }
}
                                    OUTPUT
Enter the numerator
2
Enter the denominator
3
enter the numerator
4
enter the denominator
3
2/1                     
                     
