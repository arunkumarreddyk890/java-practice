package javapractical;
import java.util.*;
public class vowelsandconstonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s.toLowerCase();
		int vowels=0;
		int consonents=0;
		//Using .indexOf() method
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				if("aeiou".indexOf(c)!=-1) {
					vowels++;
				}
				else {
					consonents++;
				}
			}
		}
		System.out.println("The no of vowels in the sentences: "+vowels);
		System.out.println("The no of consonents in the sentences: "+consonents);
		
		// using all letters
		/*
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					vowels++;
				}
				else{
					consonents++;
				}
			}
		}
		System.out.println("The no of vowels in the sentences: "+vowels);
		System.out.println("The no of cosonents in the sentences: "+consonents);
		//using Set method
		Set<Character> ch=Set.of('a','e','i','o','u');
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a'&&c<='z') {
				if(ch.contains(c)){
					vowels++;
				}
				else {
					consonents++;
				}
			}
		}
		System.out.println("The no of vowels in the sentences: "+vowels);
		System.out.println("The no of consonents in the sentences: "+consonents);
		*/
		sc.close();
	}

}
