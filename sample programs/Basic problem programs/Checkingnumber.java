//CHECKING THE GIVEN NNUMBER IS EVEN OR ODD OR ZEO
import java.util.*;
class Checkingnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value : ");
		String num=sc.nextLine();
		//System.out.print("Enter case value : ");
		//int n=sc.nextInt();
		while (true) {
			
            // Display menu
            System.out.println("\n=== Menu ===");
            System.out.println("0. calculate");
            System.out.println("1. exit");
			System.out.print("Enter case value : ");
			int n=sc.nextInt();
			switch(n){
				case 0:
					try{
						float floatnum=Float.parseFloat(num);
						//float epsilon = 0.0001f;
						if (num.contains("."))
						{
							System.out.println("The given number "+num+" is Float number");
							if(floatnum==0)
							{
								System.out.println("The given number "+num+" is zero number");
							}
							else if((floatnum%2)==0)
							{
								System.out.println("The given number "+num+" is even number");
							}
							if(floatnum%2!=0)
							{
								System.out.println("The given number "+num+" is even/odd number in float there is no even or odd");
							}
				
						}
						else
						{
							int intnum=Integer.parseInt(num);
							System.out.println("The given number "+num+" is integer number");
							if(intnum==0)
							{
								System.out.println("The given number "+num+" is zero number");
							}
							else if(intnum%2==0)
							{
								System.out.println("The given number "+num+" is even number");
							}
							if(intnum%2!=0)
							{
								System.out.println("The given number "+num+" is odd number");
							}
					
						}
					}
					catch(NumberFormatException e)
					{
						System.out.println("the number is in valid");
					}
					break;
				case 1:
					System.exit(0);
					
				default:
					System.out.println("Enter valid case");
			}
		}
	}
}