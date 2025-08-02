//FINDING LEAP YEAR ARE NOT
import java.util.*;
import javax.swing.*;
class Leapyear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("--main menu-- ");
			System.out.println("1.For finding leap year or not");
			System.out.println("2.For exit ");
			System.out.print("Enter your choice : ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.print("Enter an year : ");
					int year=sc.nextInt();
					if(year%4==0&&year%100!=0||year%400==0)
						System.out.println("The given year "+year+" is leap year");
					else
						System.out.println("The given year "+year+" is notleap year");
					break;
				case 2:
					int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
					if (response == JOptionPane.YES_OPTION) {
						System.out.println("Thank you for using the code. Goodbye!");
						System.exit(0);
					} 
					else {
						System.out.println("Exit canceled.");
					}
					break;
				default:
						System.out.println("Enter valid choice ");
			}
		}
	}
}


/*
OUTPUT:-

--main menu--
1.For finding leap year or not
2.For exit
Enter your choice : 1
Enter an year : 2000
The given year 2000 is leap year
--main menu--
1.For finding leap year or not
2.For exit
Enter your choice : 1
Enter an year : 1900
The given year 1900 is notleap year
--main menu--
1.For finding leap year or not
2.For exit
Enter your choice : 3
Enter valid choice
--main menu--
1.For finding leap year or not
2.For exit
Enter your choice : 2
Exit canceled.
--main menu--
1.For finding leap year or not
2.For exit
Enter your choice : 2
Thank you for using the code. Goodbye!
*/