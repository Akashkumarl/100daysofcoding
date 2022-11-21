Question :  Write a program to find the Quadrants in which coordinates lie


                           SOURCE CODE
                           
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the coordintes");
		int a= obj.nextInt();
		int b = obj.nextInt();
		if(a>0&&b>0)
		System.out.println("The point lies in first quadrant");
		else if(a<0&&b>0)
		System.out.println("The point lies in second quadrant");
		else if(a<0&&b<0)
		System.out.println("The point lies in Third quadrant");
		else if(a>0&&b<0)
		System.out.println("The point lies in fourth quadrant");
	}
}
                           
