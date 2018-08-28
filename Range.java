import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int f=0;
		int arr[]={1,2,3,4,5,6,7};
		for(int i=0;i<10;i++)
		{
			if(n==arr[i])
			{
				f=2;
				break;
			}
			
		}
		if(f==2)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}
