/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num=376,num,temp,total=0;
	number=num;
	while(number!=0)
	{
		temp=number%10;
		total=total+temp*temp*temp;
		number /=10;
	}
	if(total==num)
	System.out.println(num +"is an amstrong num");
         else
            System.out.println(num +"is not amstrong num");
	}
}
