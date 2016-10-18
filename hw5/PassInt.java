import java.io.*;
import java.net.*;
class PassInt{						// server
	public static void main(String args[]){
	// 1- 1024 ports reserved . (80 - web service)
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ServerSocket ss = new ServerSocket(1500);
			Socket s= ss.accept();
			System.out.println("Client connecting: " +s);
			OutputStream os=s.getOutputStream();
			DataOutputStream dos= new DataOutputStream(os);
			
			InputStream is = s.getInputStream();
			// s.getOutputStream() for output
			DataInputStream dis = new DataInputStream(is);
			while(true){
				
				int i  = dis.readInt();
				System.out.println("from client:" +i);
				// Intermediate book: "Complete Reference"
				System.out.println("Enter a Number: ");
				int n = Integer.parseInt(br.readLine());
				dos.writeInt(n);
				dos.flush();
			}
		}
		catch(UnknownHostException e1){}
		catch(IOException e2){}
	}
}