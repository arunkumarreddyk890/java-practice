//Numberpattern
import java.util.*;
class Numberpattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,row,num;
		System.out.print("Enter no.of rows : ");
		row=sc.nextInt();
		for(i=0;i<row;i++)
		{
			num=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}