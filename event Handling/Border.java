import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Border extends Applet
{
	BorderLayout bl;
	Button b1,b2,b3,b4,b5;
	public Border()
	{
		bl=new BorderLayout();
		b1=new Button("center");
		b2=new Button("left");
		b3=new Button("right");
		b4=new Button("top");
		b5=new Button("bottom");
		setLayout(bl);
		add(b1);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.EAST);
		add(b4,BorderLayout.NORTH);
		add(b5,BorderLayout.SOUTH);
	}
}

/*
<applet code=Border width=500 height=500>
</applet>*/