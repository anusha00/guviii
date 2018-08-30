import java.util.Scanner;

 class prime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=s.nextInt();
		int c=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==1)
				c++;
		}
		if(c==2)
			System.out.print("yes");
		else
			System.out.print("no");
		s.close();
	}
}
