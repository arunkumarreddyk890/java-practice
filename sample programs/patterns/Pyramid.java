import java.util.*;
class Pyramid
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of rows : ");
		int i,j,row;
		row=sc.nextInt();
		for(i=0;i<=row;i++)
		{
			for(j=row-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


OUTPUT:-

Enter no.of rows : 6
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *
