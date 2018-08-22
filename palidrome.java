/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string to check if its a palidrome");
		original=in.nextLine();
		int length = original.length();
		for(int i =length-1;i >=0; i--)
		reverse =reverse + original.charAt(i);
		if ( original.equals(reverse) )
		System.out.println("entered string is a palidrome.");
		else
		System.out.println("entered string is not a palidrome.");
	 }
 }
