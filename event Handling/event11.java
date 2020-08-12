import java.awt.event.*;
import java.awt.*;
import java.applet.*;

class event11 extends WindowAdapter
{
	Frame f;
	event11()
	{
		f=new Frame();
		f.setSize(100,700);
		f.setVisible(true);
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.println("Closing");
	}
	public static void main(String ar[])
	{
		event11 t=new event11();
	}
}