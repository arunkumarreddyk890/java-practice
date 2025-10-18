import java.util.Scanner;
class Profit{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an array size :");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int profit=0;
		int start=a[0];
		for(int i=1;i<n;i++)
		{
			int p=a[i]-start;
			if(a[i]<start)
			{
				start=a[i];
			}
			if(profit<p)
			{
				profit=p;
			}
		}
		System.out.println("The profit is: "+profit);
	}
}