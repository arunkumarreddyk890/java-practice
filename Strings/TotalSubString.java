package javapractical;
import java.util.Scanner;
public class TotalSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		s=s.toUpperCase();
		int len=s.length();
		int temp=0;
		String s1[]=new String[len*(len+1)/2];
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				s1[temp]=s.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<s1.length;i++) {
			System.out.println("The "+(i+1)+" string is: "+s1[i]);
		}
		sc.close();
	}

}
/*
OUTPUT:-
Enter the String: 
arun
The 1 string is: A
The 2 string is: AR
The 3 string is: ARU
The 4 string is: ARUN
The 5 string is: R
The 6 string is: RU
The 7 string is: RUN
The 8 string is: U
The 9 string is: UN
The 10 string is: N
*/