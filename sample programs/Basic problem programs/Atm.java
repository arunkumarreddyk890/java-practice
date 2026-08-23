import java.util.*;
import javax.swing.*;
class Atm
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int balance=10000,withdraw,deposit;
int atmpin=7964;
System.out.println("choose your option:");
while(true)
{
System.out.println("choose 1 for withdraw money");
System.out.println("choose 2 for deposit money");
System.out.println("choose 3 for check balance");
System.out.println("choose 4 for exit");
System.out.print("Enter your choice:");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.print("enter the atm pin number:");
int atmpinno=sc.nextInt();
if(atmpin==atmpinno)
{
System.out.print("enter withdraw amount:");
withdraw=sc.nextInt();

if(balance>=withdraw)
{
balance=balance-withdraw;
System.out.println("Take the withdraw money"+withdraw);
System.out.println("Available balance is:"+balance);
}
else
{
System.out.println("influence of found check the withdraw Amount");
System.out.println("The available balance is:"+balance);
}
}
else{
	System.out.println("Enter a valid pin number");
}
System.out.println("");
break;
case 2:
System.out.print("enter the atm pin number:");
atmpinno=sc.nextInt();
if(atmpin==atmpinno)
{
System.out.print("Enter amount how munch of money deposited in your account:");
deposit=sc.nextInt();
balance=balance+deposit;
System.out.println("The total availablle amount is:"+balance);
}
else{
	System.out.println("Enter a valid pin number");
}
break;
case 3:
System.out.print("enter the atm pin number:");
atmpinno=sc.nextInt();
if(atmpin==atmpinno)
{
System.out.println("The Available Balance is:"+balance);
}
else{
	System.out.println("Enter a valid pin number");
}
break;
case 4:
 int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
 if (response == JOptionPane.YES_OPTION) {
System.out.println("Thank you for using the ATM. Goodbye!");
System.exit(0);
} 
else {
System.out.println("Exit canceled.");
}
}
}
}
}

