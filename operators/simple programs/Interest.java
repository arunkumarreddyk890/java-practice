import java.util.*;
class Interest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter total amount : ");
		double amount=sc.nextDouble();
		double p=amount/100;
		System.out.print("Enter annual interset rate : ");
		double r=sc.nextDouble();
		System.out.print("Enter time period of years : ");
		int time=sc.nextInt();
		double t=time*12;
		double interest=p*r;
		System.out.println(" monthly intersest : "+interest);
		double totalmoney=amount+interest*t;
		System.out.print(time+" years total money : "+totalmoney);
	}
}