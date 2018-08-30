import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class fibnocci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=scanner.nextInt();
		int t1=2,t2=2;
		for(int i=1;i<n;++i)
		{
			System.out.println(" "+t1);
			int sum=t1+t2;
			t1=t2;
			t2=sum;
}
	}
}
