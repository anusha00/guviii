import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s1=s.nextLine();int al=0,dt=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isLetter(ch))
			{
				al=2;
			}
			else if(Character.isDigit(ch))
			{
				dt=3;
			}
		}
		if(al==2 && dt==3)
		System.out.print("no");
		else
		System.out.println("yes");
	}
}
