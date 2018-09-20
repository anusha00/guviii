import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class captalize
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	 	String ln = in.nextLine();
	 	String upper_case_line = ""; 
       	Scanner lineScan = new Scanner(line); 
        while(lineScan.hasNext())	
	{
             String word = lineScan.next(); 
             upper_case_line+= Character.toUpperCase(word.charAt(0))+word.substring(1)+" "; 
         }
    	  System.out.print(upper_case_line.trim()); 
	}
}
