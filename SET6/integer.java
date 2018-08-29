import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		if(n!=1)
		{
		while(n!=1)
		{
			cnt++;
			n=n/11;
		}
		
		System.out.println(cnt);	
		}
		else
		System.out.println("2");
		
		
	}
}
