import java.util.*;
class Celsiustofahrenheit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Celsius : ");
		float c=sc.nextFloat();
		float f=(c*(9/5))+32;
		System.out.println("The Celsius is "+c+" fahgrenhiet is "+f);
	}
}