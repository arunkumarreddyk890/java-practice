//DOWNWARD TRIANGLE
import java.util.*;
class Downwardtriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,row;
		System.out.print("Enter row value : ");
		row=sc.nextInt();
		for(i=1;i<=row;i++)
		{
			for(j=0;j<=row-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

/*
OUTPUT:-

Enter row value : 6
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/