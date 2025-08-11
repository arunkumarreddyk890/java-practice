import java.util.*;
class Multiplicationtable
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter which table want to you : ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			if(i==10)
			{
				int ans=num*i;
				System.out.println(num+" * "+i+"= "+ans);
			}
			else
			{
				int ans=num*i;
				System.out.println(num+" * "+i+" = "+ans);
			}
		}
	}
}