import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

		// your code goes here
		Scanner s=new Scanner(System.in);
		String s=scanner.nextLine();
		int count=0,i=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
			
		}
		System.out.print(""+count);
	}

}

	
