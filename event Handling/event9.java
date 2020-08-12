import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class event9 extends Applet
{
	BorderLayout b;
	Button b1,b2,b3,b4,b5;
	public event9()
	{
		b1=new Button("Center");
		b2=new Button("North");
		b3=new Button("East");
		b4=new Button("West");
		b5=new Button("South");
		
		b=new BorderLayout();
		setLayout(b);
		add(b1);
		add(b2,BorderLayout.NORTH);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.SOUTH);
	}
}	
/* <applet code="event9" height="500" width="500">
</applet>*/		