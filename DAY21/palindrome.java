Question :Write a program to identify if the number is Palindrome or not

                                   SOURCE CODE
import java.util.*;
class Main{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  Scanner obj = new Scanner(System.in);
  int n = obj.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10; 
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
                             OUTPUT
121
palindrome number 
                                   
