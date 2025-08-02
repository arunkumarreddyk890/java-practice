//FIND LARGEST NUMBER OF THREEE NUMBERS
import java.util.*;
class Findlargestnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first value : ");
		int a=sc.nextInt();
		System.out.print("Enter second value : ");
		int b=sc.nextInt();
		System.out.print("Enter Third value : ");
		int c=sc.nextInt();
		int largest=a;
		if(b>largest)
			largest=b;
		if(c>largest)
			largest=c;
		else
			largest=a;
		System.out.println("The largest number is : "+largest);
	}
}
		
/*
OUTPUT:-

Enter first value : 3
Enter second value : 6
Enter Third value : 2
The largest number is : 3

Enter first value : 4
Enter second value : 3
Enter Third value : 2
The largest number is : 4

Enter first value : 2
Enter second value : 3
Enter Third value : 4
The largest number is : 4	
*/	