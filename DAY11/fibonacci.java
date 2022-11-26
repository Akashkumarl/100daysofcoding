Question : Write a program to find Fibonacci series up to n

                   SOURCE CODE
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,first=0,second=1;
	    Scanner obj = new Scanner(System.in);
	    System.out.println("enter the size");
	    int n = obj.nextInt();
		System.out.println("the fibonacci series is");
		System.out.println(+first);
			System.out.println(+second);
		for(i=2;i<n;i++)
		{
		  int third = first+second;
		  first=second;
		  second=third;
		  System.out.println(+third);
		  
		}
	}
}

         OUTPUT
enter the size
10
the fibonacci series is
0
1
1
2
3
5
8
13
21
34                   
