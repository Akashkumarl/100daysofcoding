Question :Write a program to find Area of a circle

                              SOURCE CODE
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the radius");
		float n = obj.nextFloat();
		System.out.println("the area of circle is ");
		double m = 3.14*n*n;
		System.out.println(m);
	}
}

                              OUTPUT
enter the radius
3
the area of circle is 
28.259999999999998                             
