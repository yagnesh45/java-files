 import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class event1 extends Applet implements ActionListener
{
	Button b;
	Panel p;
	Label text;
	GridLayout gd;
	boolean f=false;
	public event1()
	{
		b=new Button("Go!");
		gd=new GridLayout(3,1);
		text=new Label("Game Started! Respwning in 3..2..1");
		add(b);
		setLayout(gd);
		b.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		text.setBackground(Color.RED);
		text.setForeground(Color.WHITE);
		setBackground(Color.RED);
		f=true;
		
		
		repaint();
	}
	
	public void paint(Graphics g)
	{
		if(f)
		{
			g.drawString("Game Started!Respawing in 3..2..1!",50,290);
		}
	}
}

/*
<applet code="event1" height="300" width="300">
</applet>
*/
		