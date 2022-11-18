Question :  Write a program to find ASCII values of a character



                             SOURCE CODE
                             
                             
                             
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the Character");
		char c = obj.next().charAt(0);
		int ascii = (int)c;
		System.out.println("the ascii value of\t" + c +"\tis \t" + ascii);
		
	}
}
                            
