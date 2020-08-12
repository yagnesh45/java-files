import java.awt.event.*;
import java.awt.*;
import java.applet.*;
class frm extends WindowAdapter
{
	Frame f;
	frm()
	{
		f=new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(this);
	}
	public static void main(String p[])
	{
		frm t=new frm();
	}
	public void windowClosing(WindowEvent we)
	{
		System.out.print("Window Closing");
	}
}
