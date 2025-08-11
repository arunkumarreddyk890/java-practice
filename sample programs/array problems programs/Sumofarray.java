//CALCULATE THE SUM OF THE ARRAY ELEMENTS
import java.util.*;
class Sumofarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.print("The sum of array elements is: "+sum);
	}
}
/*
 output:-

Enter no.of elements: 5
1
2
3
4
5
The sum of array elements is: 15
*/ 