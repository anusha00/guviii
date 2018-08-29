import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=s.nextInt();int sum=1;
		while(n!=1)
		{
			int rem=n%10;
			sum=sum+1;
			n=n/15;
		}
		System.out.print(sum);
	}
}
