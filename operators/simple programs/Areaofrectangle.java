import java.util.*;
class Areaofrectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter width:");
		float width=sc.nextFloat();
		System.out.print("Enter height:");
		float height=sc.nextFloat();
		float Area=width*height;
		if(width==height)
		{
			System.out.println("it is a Square");
		    System.out.println("Area of Square:"+Area);
		}
		else
			System.out.println("Area of Rectangle"+Area);
		//Traianle area
		System.out.print("Enter Base:");
		float base=sc.nextFloat();
		float Tarea=(base*height)/2;
		System.out.println("Area of Triangle"+Tarea);
	}
}
		
		