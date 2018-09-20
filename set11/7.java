import java.util.Scanner;

class Program7 {

	public static void main(String[] args) {
String s;
char t;
Scanner sc=new Scanner(System.in);
s=c.nextLine();
char a[]=sc.toCharArray();
for(int i=0;i<s.length();i+=2) {
	t=a[i];
	a[i]=a[i+1];
	a[i+1]=t;
}
for(int i=0;i<s.length();i++)
System.out.printf(a[i]);
	}

}
