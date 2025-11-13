package javapractical;
import java.util.*;
public class Stringequalparts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		System.out.println("Enter N for no.of equal parts: ");
		int n=sc.nextInt();
		int len=s.length();
		String parts[]=new String[n];
		int temp=0,chars=len/n;
		if(len%n!=0) {
			System.out.print("The string can't divide into equal parts");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				parts[temp]=s.substring(i,i+chars);
				temp++;
			}
			for(int i=0;i<n;i++) {
				System.out.println("The first part is: "+parts[i]);
			}
		}
		
		sc.close();
	}

}
