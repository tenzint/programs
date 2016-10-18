import java.io.*;
import java.util.*;

class Calculator
{
	static int add (int x, int y)
	{	return (x+y);	}
	static int sub (int x, int y)
	{	return (x-y);	}
	static int multiply (int x, int y)
	{	return (x*y);	}
	static int divide (int x, int y)
	{	return (x/y);	}
	static int mod (int x, int y)
	{	return (x%y);	}		
}

class HWCalculator
{
	public static void main(String args[])
	{
		// create a shell based interface for communication with users
		Scanner in = new Scanner (System.in);
		boolean inLoop = true;
		String cmd = "";
		int x, y, res;
		while(inLoop)
		{
			System.out.println(" -------------------------------------------------------------- ");
			System.out.println(" --> Enter one of the following commands~");
			System.out.println(" ~ (Keywords: add, sub, multiply, divide, mod; or quit to exit the shell)");
			System.out.print(" cmd: ");
			cmd = in.next();
			// System.out.println(" cmd: " + cmd);				// echo'ed cmd value for test
			
			switch(cmd)
			{
				case "add":
					System.out.print(" Enter the 2 operands separated by space/new line: ");
					x = in.nextInt();
					y = in.nextInt();
					res = Calculator.add(x, y);
					System.out.println(x + " + " + y + " = " + res);
					break;
				case "sub":
					System.out.print(" Enter a number: ");
					x = in.nextInt();
					System.out.print(" Enter a number to subtract: ");
					y = in.nextInt();
					res = Calculator.sub(x, y);
					System.out.println(x + " - " + y + " = " + res);
					break;
				case "multiply":
					System.out.print(" Enter 2 numbers separated by space/new line: ");
					x = in.nextInt();
					y = in.nextInt();
					res = Calculator.multiply(x, y);
					System.out.println(x + " X " + y + " = " + res);
					break;
				case "divide":
					System.out.print(" Enter a numerator: ");
					x = in.nextInt();
					System.out.print(" Enter a denominator: ");
					y = in.nextInt();
					res = Calculator.divide(x, y);
					System.out.println(x + " / " + y + " = " + res);
					break;
				case "mod":
					System.out.print(" Enter a numerator: ");
					x = in.nextInt();
					System.out.print(" Enter a denominator: ");
					y = in.nextInt();
					res = Calculator.mod(x, y);
					System.out.println(x + " % " + y + " = " + res);
					break;					
				case "quit":
					inLoop = false;
					break;
				default:
					System.out.println(" Error: command not found!");
					break;
			}
			
			/*
			if (cmd.compareTo("quit")==0)
			{
				inLoop = false;
				System.out.println(" inside cmd = quit");
			}
			*/
		}
	}
}