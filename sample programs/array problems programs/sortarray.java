//FIND SORT OF ARRAY WITHOUT and WITH USING DEFALUT METHOD
import java.util.*;
import javax.swing.*;
class sortarray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter an elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before sorting array is:");
		System.out.print("[");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		while(true)
		{
			System.out.println("=== Main Menu ===");
			System.out.println("1. For without using Array.sort default Method");
			System.out.println("2. For with using Array.sort default Method");
			System.out.println("3. For Exit");
			System.out.print("Enter your choice : "); 
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				for(int i=0;i<n-1;i++)
				{
					for(int j=0;j<n-i-1;j++)
					{
						if(a[j]>a[j+1])
						{
							int temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
				System.out.println();
				System.out.println("After sorting array is:");
				System.out.print("[");
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.println("]");
				break;
				case 2:
				Arrays.sort(a);
				System.out.println("After sorting array is:");
				System.out.print("[");
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.println("]");
				break;
				case 3:
				int res=JOptionPane.showConfirmDialog(null,"Are you sure want to exit?","Confirm Exit",JOptionPane.YES_NO_OPTION);
				if(res==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				else
				{
					System.out.print("Exit canclled!");
				}
				
			}
		}
	}
}