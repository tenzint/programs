import java.io.*;
import java.util.*;
class CheckEvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = sc.nextInt();
		
		if (i%2 == 0)
			System.out.print(i + " is an even number.\n");
		else
			System.out.print(i + " is an odd number.\n");
	}	
}	