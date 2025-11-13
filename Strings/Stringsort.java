package javapractical;
import java.util.*;
public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s=sc.nextLine();
		s.toLowerCase();
		//to check the ascii value and compare and store the characters differently
		char c[]=s.toCharArray();
		while(true)
		{
			// To Analyze the bubble sort method and Arrays.sort() method 
			System.out.println("1 for bubble sort");
			System.out.println("2 for Arrays.sort method");
			System.out.println("3 for exit");
			System.out.print("Enter your choice: ");
			int choice=sc.nextInt();
			switch(choice) {//to choose the option for predefined function and bubble sort method
				case 1:
					for(int i=0;i<c.length;i++) {
						for(int j=i+1;j<c.length;j++) {
							if(c[i]>c[j]) {//check the characters which is getter
								char temp=c[j];
								c[j]=c[i];//Swap the elements
								c[i]=temp;
							}
						}
					}
					for(int i=0;i<c.length;i++) {
						System.out.print(c[i]);
					}
					System.out.println();//To print while Starting after output
					break;
				case 2:
					Arrays.sort(c);
					System.out.print(c);
					System.out.println();
					break;
				case 3:
					System.out.println("Thankyou");
					System.exit(0);
					
			}
		}
		
	}

}
/*
 * OUTPUT:-
 * Enter the String: arun
1 for bubble sort
2 for Arrays.sort method
3 for exit
Enter your choice: 1
anru
1 for bubble sort
2 for Arrays.sort method
3 for exit
Enter your choice: 3
Thankyou
*/
