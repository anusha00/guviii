import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s = "hello world ";
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 2; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 5) != ' '))
			{
				count++;
 
			}
		}
 		System.out.print(" " + count);
		
	}
}
