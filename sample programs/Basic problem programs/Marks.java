import java.util.*;
class Marks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Marks Between 0 to 100 : ");
		int marks=sc.nextInt();
		if(marks>=90)
			System.out.print("Grade : A ");	
		else if(marks>=75)
			System.out.print("Grade : B ");
		else if(marks>=55)
			System.out.print("Grade : c ");
		else if(marks>=35)
			System.out.print("Grade : D ");
		else
			System.out.print("The Student is Fail");
	}
}
	
		