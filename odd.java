/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("the odd number are:");
		for(int i=1;i<=100;i++)
		{
			if(i %2 !=0)
			{
				System.out.println(i +" ");
			}
		}
	}
}
