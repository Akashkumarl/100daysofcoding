QUESTION : Write a program to identify if the character is a vowel or consonant.

                                    SOURCE CODE

import java.util.*;

 class Main
{
	public static void main(String[] args)
	{ 
	    Scanner obj = new Scanner(System.in);
	    System.out.println("enter the alphabet or character");
	    char a = obj.next().charAt(0);
       	if(a =='a'||a =='A')
       {
          System.out.println("Vowel");
       }
       else if(a =='e'||a =='E')
       {
          System.out.println("Vowel");
       }
       else if(a =='i'||a =='I')
       {
          System.out.println("Vowel");
       }
       else if(a =='o'||a =='O')
       {
          System.out.println("Vowel");
       }
       else if(a =='u'||a =='U')
       {
          System.out.println("Vowel");
       }
       else if((int)a >= 97 && a <= 122|| a >= 65&& a <=90 )
       {
          System.out.println("Consonant");
       }
       else
       {
          System.out.println("Invalid Input");
       }
       
	}
}
