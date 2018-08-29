import java.util.*;
import java.lang.*;
class linec{
     public static void main(String aa[]){
     	Scanner sc=new Scanner(System.in);
      String a;
      int count=1;
      Scanner s=new Scanner(System.in);
      a=s.nextLine();
     String b[]=a.split("\\.");
     for(int i=2;i<b.length;i++){
         count++;
     }
     System.out.print(count);
    }


}
	
