import java.util.*;
class Simpleinterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total amount : ");
		double p=sc.nextDouble();
		System.out.print("Enter annual interset rate : ");
		double r=sc.nextDouble();
		System.out.print("Enter time period of years : ");
		double t=sc.nextDouble();
		double interest=(p*r*t)/100;
		System.out.println("Enter simple intersest : "+interest);
		double totalmoney=p+interest;
		System.out.print("Enter total money : "+totalmoney);
	}
}