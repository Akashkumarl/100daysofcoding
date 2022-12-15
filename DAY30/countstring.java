Question : Write a Program to print Length of the string without using strlen() function

                                 SOURCE CODE
                                 
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int length=0,i=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String s =obj.nextLine();
		String a = s+'\0';
		while(a.charAt(i)!='\0')
		{
		    length++;
		    i++;
		}
		System.out.println("the length of string is "+length);
	}
}


                                   OUTPUT
enter the string
hello
the length of string is 5                                 
