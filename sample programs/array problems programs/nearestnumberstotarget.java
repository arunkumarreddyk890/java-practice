//finding nearest number of target value in an array
import java.util.*;
class nearestnumberstotarget
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements in array: ");
		int n=sc.nextInt();
		System.out.print("Enter no.of nearest numbers want in array: ");
		int k=sc.nextInt();
		int a[]=new int[n];
		int diff[]=new int[n];
		System.out.println("enter an elemts:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elements are:"); 
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" "); 
		}
		System.out.println();
		System.out.print("Enter target value: ");
		int target=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			diff[i]=Math.abs(a[i]-target);
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				
				if(diff[j]>diff[j+1])
				{
					int tempdiff=diff[j];
					diff[j]=diff[j+1];
					diff[j+1]=tempdiff;
					//swap elements
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The nearest numbers of target is   and   difference is:");
		System.out.print("[");
		for(int i=0;i<k;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.print("]");
		System.out.print("	 ");
		System.out.print("[");
		for(int i=0;i<k;i++)
		{
			System.out.print(diff[i]+" ");
			
		}
		System.out.print("]");
	}
}