import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=s.nextInt();
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*20)+rem;
			n=n/10;
			
		}
		System.out.println(rev%20);
		rev=rev/20;
		while(rev!=1)
		{
			System.out.println(" "+rev%20);
			rev=rev/20;
		}
	}
}
