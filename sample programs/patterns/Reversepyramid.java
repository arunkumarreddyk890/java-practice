//REVERSE PYRAMID
import java.util.*;
class Reversepyramid
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,row;
		System.out.print("Enter no.of rows : ");
		row=sc.nextInt();
		//int space=0;
		for(i=0;i<row;i++)
		{
			for(j=row;j>row-i;j--)
			{
				System.out.print(" ");
			}
			//space++;
			for(j=0;j<row-i;j++)
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
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/