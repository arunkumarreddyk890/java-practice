import java.util.*;
class Diamond
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,row;
		System.out.print("Enter no.of rows : ");
		row=sc.nextInt();
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			//space--;
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
			int space=1;
			for(i=1;i<=row-1;i++)
			{
				for(j=1;j<=space;j++)
				{
					System.out.print(" ");
				}
				space++;
				for(j=1;j<=row-i;j++)
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
 * * * * *
  * * * *
   * * *
    * *
     *
*.
