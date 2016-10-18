import java.io.*;
import java.net.*;
class PassIntToServer{			// client
	public static void main(String args[]){
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Socket s= new Socket("127.0.0.1", 1500);
			OutputStream os=s.getOutputStream();
			DataOutputStream dos= new DataOutputStream(os);
			InputStream is = s.getInputStream();
			// s.getOutputStream() for output
			DataInputStream dis = new DataInputStream(is);
			while(true){
				
				System.out.println("Enter a Number: ");
				int n = Integer.parseInt(br.readLine());
				dos.writeInt(n);
				dos.flush();
				
				int i  = dis.readInt();
				System.out.println("from client:" +i);
			}
			//dos.close();
		}
		catch(UnknownHostException e1){}
		catch(IOException e2){}
	}
}