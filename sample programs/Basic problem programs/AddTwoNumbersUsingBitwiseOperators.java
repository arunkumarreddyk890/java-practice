package javapractical;
import java.util.Scanner;
public class AddTwoNumbersUsingBitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		System.out.println("Enter second number :");
		int b=sc.nextInt();
		while(b>0) {
			int carry=a&b;
			a=a^b;//adding without carray
			b=carry<<1;//b=0 some where
		}
		System.out.println("The sum of the numbers: "+a);
		sc.close();
	}

}
