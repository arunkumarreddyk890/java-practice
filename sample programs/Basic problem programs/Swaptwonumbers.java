//SWAP TWO MUMBER USING TEMPORARY VARIABLE
import java.util.*;
class Swaptwonumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		int a=sc.nextInt();
		System.out.print("Enter b value : ");
		int b=sc.nextInt();
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The a value is : "+a);
		System.out.println("The b value is : "+b);
	}
}
		
/*

OUTPUT:-

Enter a value : 2
Enter b value : 5
The a value is : 5
The b value is : 2
*/