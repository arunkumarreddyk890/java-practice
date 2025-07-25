import java.util.*;
class Addition{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a value:");
		int a=sc.nextInt();
		System.out.print("Enter the b value:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.print("The addition of two number"+c);
	}
}