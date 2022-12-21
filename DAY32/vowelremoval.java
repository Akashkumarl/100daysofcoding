Question : Write a Program to Remove vowels from a string

               SOURCE CODE
               
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int c=0,i=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("enter the string");
		String s = obj.nextLine();
		String a = s+'\0';
		while(a.charAt(i)!='\0')
        {c = a.charAt(i);
            switch(c)
		   {
		    case 'a': 
		             break;
		    case 'e':
		             break;
		    case 'i':
		             break;
		    case 'o':
		             break;
		    case 'u':
		             break;
		    default : System.out.print(a.charAt(i));           
		   }
		   i++;
        }
	}
}

                           OUTPUT
enter the string
remove
rmv              
