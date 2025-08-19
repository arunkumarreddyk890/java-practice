//FINDING THE GIVEN NUMBER IS AUTOMARPHIC NUMBER OR NOT
import java.util.*;
class automarphicnumber
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		int squa=num*num;
		int lastdigits,count=0,temp=num;
		while(num>0)
		{
			/*if(num%10!=squa%10)
			{
				System.out.println("The given number "+temp+" is not automarphic number");
			}*/
			num=num/10;
			count++;
		}
		lastdigits=(int)(squa%(Math.pow(10,count)));
		if(temp==lastdigits)
		{
			System.out.print("The given number "+temp+" is automorphic number");
		}
		else
		{
			System.out.println("The given number "+temp+" is not automarphic number");
		}
	}
}
