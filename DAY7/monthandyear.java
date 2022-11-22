  Question   :  Write a program to find Number of days in a given month of a given year


                                    Source Code
                                    
                                    
  import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{	Scanner obj = new Scanner(System.in);
		System.out.println("enter the months");
	    int m = obj.nextInt();
	    System.out.println("enter the year");
	    int n = obj.nextInt();
	     if(n%400==0)
	        {if(n%4==0)
	             { if(m==2)                                                                OUTPUT
	              System.out.println("29");
	               if(m==7)
	               System.out.println("31");                                       enter the month 
	               if(m!=2&&m!=7)                                                  2
	                {if(m%2==0)                                                    enter the year
	                    System.out.println("31");                                  2000
	                 else                                                          29
	                    System.out.println("30");
	                }
	             }     
	    
	        }
	     else
	        { 
	           if(m==7)
	            System.out.println("31");
	              if(m!=2&&m!=7)
	                {if(m%2==0)
	                    System.out.println("31");
	                 else
	                    System.out.println("30");
	                }
	             }   
	}          
}                                  
