
//8. Write a program to reverse a string.
//Input : "hello"
//Output : "olleh"
//Input : "Hello World"
//Output : "dlrow olleh" 

import java.lang.*;
import java.io.*;
import java.util.*;
 
class ReverseString 
{
	public static void main(String[] args)
	{
        	String input = "Hello World";
		StringBuilder input1 = new StringBuilder();
		
 		// append a string into StringBuilder input1
        	input1.append(input);
		
 
       		 // reverse StringBuilder input1
        	input1 = input1.reverse();
		
 
        	// print reversed String
        	System.out.println(input1);
		
    }
}