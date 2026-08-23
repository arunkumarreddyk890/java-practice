import java.util.*;
class Avarage{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b=0;
		for(int i=0;i<n;i++)
		{
			System.out.print("enter values");
			a[i]=sc.nextInt();
			b=b+a[i];
		}
		int ave=b/2;
		System.out.println("the avareage of numbers: "+ave);
	}
}

		