import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int count=0,num=546;
		while(num!=0)
		{
			num/=20;
			++count;
		}
		System.out.println("nuber of digits:"+count);
	}
}
