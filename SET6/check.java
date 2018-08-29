import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int cnt=0;
		for(int j=0;j<n;j++)
		{
			if(a[j]==k)
			{
			cnt=2;break;
			}
		}
		if(cnt==2)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
