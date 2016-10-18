import java.io.*;
import java.util.*;

class Practice1 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean c = true;
		do
		{
			System.out.println (" ----------------------------------------------------- ");
			System.out.println ("Enter an operand: \n"
								+ "1 for + \n" 
								+ "2 for - \n" 
								+ "3 for * \n" 
								+ "4 for / \n" 
								+ "5 for %\n"
								+ "6 for exit\n");
			int choice = sc.nextInt();
			int x, y, res;
			switch (choice)
			{
				case 1: System.out.print("Enter operand 1: ");
						x = sc.nextInt();
						System.out.print("Enter operand 2: ");
						y = sc.nextInt();
						
						System.out.println(x + " + " + y + " = " + (x+y));
						break;
				case 2: System.out.print("Enter operand 1: ");
						x = sc.nextInt();
						System.out.print("Enter operand 2: ");
						y = sc.nextInt();
						
						System.out.println(x + " - " + y + " = " + (x-y));
						break;
				case 3: 
						System.out.print("Enter operand 1: ");
						x = sc.nextInt();
						System.out.print("Enter operand 2: ");
						y = sc.nextInt();
						System.out.println(x + " X " + y + " = " + (x*y));
						
						break;
				case 4:
						System.out.print("Enter operand 1 (dividend): ");
						x = sc.nextInt();
						System.out.print("Enter operand 2 (divisor): ");
						y = sc.nextInt();
						if (y == 0)
						{
							System.out.println("Error: a number divided by 0!");
							break;
						}
						System.out.println(x + " / " + y + " = " + (x/y));
						break;
				case 5:
						System.out.print("Enter operand 1: ");
						x = sc.nextInt();
						System.out.print("Enter operand 2: ");
						y = sc.nextInt();
						if (y == 0)
						{
							System.out.println("Error: a number divided by 0!");
							break;
						}
						System.out.println(x + " % " + y + " = " + (x%y));
						break;
				case 6:
						c = false;
						break;
				default:
						System.out.println("Enter a valid operation\n");
						break;
			}
		
		} while (c);
	}
	
}