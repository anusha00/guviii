import java.util.Scanner;
 class kthorder
 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=s.nextInt();
		int k=s.nextInt();
		int[]a=new int[size];
		for(int i=0;i<size;i++){
			a[i]=in.nextInt();
		}
if(a[k]%2!=0){
	System.out.printf(a[k]);
}else{
	System.out.printf(a[k+1]);
}
	}

}
