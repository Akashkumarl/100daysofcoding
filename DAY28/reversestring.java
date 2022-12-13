Question :Write a Program to reverse a string.

                   SOURCE CODE
                   
import java.lang.*;

import java.io.*;

import java.util.*;

public class Main {

    public static void main(String[] args)

    {

    String stringInput = "Hello";  
    int iStrLength=stringInput.length();    

for(iStrLength=stringInput.length();iStrLength >0;-- iStrLength)

{

System.out.print(stringInput.charAt(iStrLength -1)); 

}

    }

}

                              OUTPUT
olleH                   
