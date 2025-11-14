package javapractical;
import java.util.Scanner;
public class SubtractTwoNumbersUsingBitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter a number:");
		int b=sc.nextInt();
		while(b>0) {
			int barrow=(~a)&b;
			a=a^b;
			b=barrow<<1;
		}
		System.out.println("the Subtraction of numbers: "+a);
		sc.close();
	}

}
