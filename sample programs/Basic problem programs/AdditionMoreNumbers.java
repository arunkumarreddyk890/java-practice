package javapractical;
import java.util.Scanner;
public class AdditionMoreNumbers {
	static int addition(int a,int b) {
		while(b!=0) {
			int carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of numbers: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		//int sum=0;
		System.out.println("Enter an numbers: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=addition(sum,a[i]);
		}
		System.out.println("The sum of numbers is: "+sum);
		sc.close();
	}

}
/*
 * output:-
 * enter no.of numbers: 
5
Enter an numbers: 
1 2 3 1 2
The sum of numbers is: 9
*/
