import java.io.*;

class HWBufferedRead
{
	public static void main(String args[]) throws Exception
	{
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			System.out.print("Enter a number: ");
			int i = Integer.parseInt(in.readLine());
			
			System.out.println("You entered " + i );
		}
		catch (IOException e) {
			System.err.println("Error: " + e);
		} catch (NumberFormatException e) {
			System.err.println("Invalid number");
		}
	}	
}	