import java.util.Scanner;

 class Swap_Numbers 
{

	public static void main(String[] args)
	{
		int a ,b;
		Scanner s=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print(" "+ a+" "+b);

	}

}
