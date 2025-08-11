//FIND SUM OF FIRST N NATURAL NUMBER
import java.util.*;
class Sumofnaturalnumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter ending number : ");
		int a=0;
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			a=a+i;
		}
		System.out.println("The sum of natural numbers upto ending number is : "+a);
	}
}