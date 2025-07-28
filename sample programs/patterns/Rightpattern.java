import java.util.*;
class Rightpattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,rows;
		System.out.print("Enter no.of rows : ");
		rows=sc.nextInt();
		System.out.println("");
		for(i=0;i<=rows;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

/*
OUTPUT:-

Enter no.of rows : 6

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
*/
