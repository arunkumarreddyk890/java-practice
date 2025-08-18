//THE ONE ARRAY ELEMENTS COPY INTO ANOTHER ARRAY
import java.util.*;
import java.util.Arrays;
class arraycopy{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[a.length];
		System.out.print("The first array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]=sc.nextInt());
			System.out.print(" ");
		}
		System.out.print("The second array elements are: ");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int c[]=Arrays.copyOf(a,a.length);
		System.out.print("The third element copy method: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.print("The clone method is using: ");
		int d[]=a.clone();		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		System.out.println();
		System.out.print("The clone System.arraycopy method is using: ");
		int e[]=new int[a.length];
		System.arraycopy(a,0,e,0,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(e[i]+" ");
		}
	}
}

/*
OUTPUT:-

Enter the length of the array:5
The first array elements are: 1 2 3 4 5 6
1 2 3 4 5 The second array elements are: 1 2 3 4 5
The third element copy method: 1 2 3 4 5
The clone method is using: 1 2 3 4 5
The clone System.arraycopy method is using: 1 2 3 4 5

*/