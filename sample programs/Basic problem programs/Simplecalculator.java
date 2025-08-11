import java.util.*;
import javax.swing.*;
class Simplecalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a First number : ");
		int a=sc.nextInt();
		System.out.print("Enter a Second number : ");
		int b=sc.nextInt();
		while (true) {
			
            // Display menu
            System.out.println("\n=== Menu ===");
            System.out.println("0. Addition");
            System.out.println("1. Subtraction");
            System.out.println("2. Multiplication");
            System.out.println("3. Division");
            System.out.println("4. Exit");
			System.out.print("Enter case value : ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 0:
				System.out.print("The addition of : "+(a+b));
				break;
				case 1:
				System.out.print("The subtraction of : "+(a-b));
				break;
				case 2:
				System.out.print("The multiplication of : "+(a*b));
				break;
				case 3:
				System.out.print("The division of : "+(a/b));
				break;
				case 4:
				int response=JOptionPane.showConfirmDialog(null,"Are you sure want exit?","confirm Exit",JOptionPane.YES_NO_OPTION);
				if(response==JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
				else
				{
					System.out.print("Exit canclled");
				}
			}
		}
	}
}