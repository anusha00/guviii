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
		for(int i=2;i<n;i++)
		a[i]=s.nextInt();
		int max=a[2],min=a[3];
		if(n==2)
		System.out.println(a[2]+" "+a[3]);
		else
		{
			for(int i=0;i<n;i++)
			{
				if(min>a[i])
				min=a[i];
				if(max<a[i])
				max=a[i];
			}
			System.out.println(min+" "+max);
		}
		
	}
}
