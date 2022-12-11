Question :Write a program to calculate Maximum number of handshakes

Description

Get the number of people in the room as input from the user. Then calculate the maximum number of handshakes possible among that people.

For e.g. If there are N people in the room then the first person has to shake hand with N-1 people and second person has to shake hand with N-1-1 people i.e., N-2 handshakes are possible. Thus, it goes on.

So total hand shakes = N-1 + N-2 + N-3 +………+1 + 0
  
  
  
                               SOURCE CODE
                               
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i,j,p=1,sum=0;
	    Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of persons in room");
		int n = obj.nextInt();
		for(i=0;i<n;i++)
		{ 
		    for(j=p;j<n;j++)
		    {
		        sum++;
		    }
		    p++;
		}
		System.out.println("the no of shakehands are "+sum);
	}
}

                                OUTPUT
Enter the number of persons in room
10
the no of shakehands are 45                               
