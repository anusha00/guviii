import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int sum=3;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/n);
	}
}
