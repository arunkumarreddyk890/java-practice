import java.util.*;
class Leftpettern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,row;
		System.out.print("Enter no.of rows : ");
		row=sc.nextInt();
		System.out.println("");
		for(i=0;i<=row;i++)
		{
			for(j=2*(row-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}

/*
OUTPUT:-
	
	      *
            * *
          * * *
        * * * *
      * * * * *
    * * * * * *
  * * * * * * *
*/
