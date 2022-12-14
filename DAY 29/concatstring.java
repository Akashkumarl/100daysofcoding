Question : Write a program to concatenate two strings

                SOURCE CODE
import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
System.out.println("Enter the first string");
String a = obj.nextLine();
System.out.println("Enter the second string");
String b = obj.nextLine();
System.out.println(a+b);
}
} 

Output
Enter the first string
Hello
Enter the second string
Hii
HelloHii
