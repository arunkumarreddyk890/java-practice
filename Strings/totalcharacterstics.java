package javapractical;
import java.util.*;
public class totalcharacterstics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		int space=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ') {
				count++;
			}
			else {
				space++;
			}
		}
		int total=count+space;
		System.out.println("Total no.of characters in String: "+count);
		System.out.println("Total no.of Spaces in String: "+space);
		System.out.print("Total charcters & Spaces in String: "+total);
		sc.close();
	}

}
