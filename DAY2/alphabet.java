Question :  Write a program to identify if the character is an alphabet or not.
                           
  
                                  SOURCE CODE
                                  
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the character");
		char c = obj.next().charAt(0);
		if((int)c>=65&&c<91||c>=97&&c<=122)
		System.out.println("Alphabet");
		else
		System.out.println("Not an alphabet");
		
	}
}
                                  
