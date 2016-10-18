import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code=SampleGUI.class width=750 height=500></applet>
public class HWserver extends Applet implements MouseListener
{
	TextField t1;
	Label l1,l2;
	Button b1;
	public void init()
	{
		l1=new Label("Name: ");
		l2=new Label(" ");
		t1 = new TextField(25);				// 25 pixel length showed only
		b1=new Button("OK");
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		t1.addMouseListener(this);
		l1.setEnabled(true);
		l2.setEnabled(true);
		t1.setEnabled(true);
		b1.setEnabled(true);
		l1.setVisible(true);
		l2.setVisible(false);
		t1.setVisible(true);
		b1.setVisible(true);
		t1.setText("Enter name");
	}
	public void paint(Graphics g)
	{
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,300,400,300);
		t1.setBounds(300,100,100,30);
		b1.setBounds(300,150,50,30);
		t1.requestFocus();
	}
	public void mouseClicked(MouseEvent me)
	{
		if(me.getSource() == t1)
		{
			System.out.println("in button action");
			t1.setText("");
		}
	}
	public boolean action(Event e, Object o)
	{
		if(e.target == b1)
		{
			System.out.println("in button action");
			l2.setText("Hi "+t1.getText()+" Welcome to applet programming!!");
			l2.setForeground(color.red);
			l2.setVisible(true);
		}
		repaint();
		return true;
	}
}
class PassInt{						// server
	public static void main(String args[]){
	// 1- 1024 ports reserved . (80 - web service)
		try{
			
			ServerSocket ss = new ServerSocket(1500);
			Socket s= ss.accept();
			System.out.println("Client connecting: " +s);
			InputStream is = s.getInputStream();
			// s.getOutputStream() for output
			DataInputStream dis = new DataInputStream(is);
			int i  = dis.readInt();
			System.out.println("from client:" +i);
			// Intermediate book: "Complete Reference"
		}
		catch(UnknownHostException e1){}
		catch(IOException e2){}
	}
}