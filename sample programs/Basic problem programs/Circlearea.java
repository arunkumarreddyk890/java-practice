//findind circle area
import java.util.*;
class Circlearea
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the circle Radius : ");
		float radius=sc.nextFloat();
		float area=(float)(Math.PI*radius*radius);
		System.out.println("The area of circle is : "+area);
	}
}

/*
OUTPUT

Enter the circle Radius : 4.23
The area of circle is : 56.212204
*/