import java.util.*;
class Findremainder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first value:");
		int a=sc.nextInt();
		System.out.print("Enter the second value:");
		int b=sc.nextInt();
		int remainder=a%b;
		System.out.print("The renainder: "+remainder);
	}
}
		