//FINDING THE LARGEST NUMBER IN ARRAY
import java.util.*;
class Largestelement
{
	public static void  main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements  : ");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter elements  : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The largest number in array is : "+max);
	}
}

/*

output:-

Enter no.of elements  : 5
Enter elements  :
1
2
3
4
5
1 2 3 4 5
The largest number in array is : 5
*/
