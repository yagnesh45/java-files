import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class event4 extends Applet implements ActionListener
{
	Panel p;
	Button b1,b2,b3;
	GridLayout gd;
	public event4()	
	{
		p=new Panel();
		gd=new GridLayout(3,1);
		b1=new Button("R");
		b2=new Button("G");
		b3=new Button("B");
		
		add(p);
		p.setLayout(gd);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setBackground(Color.BLACK);
	}
		public void actionPerformed(ActionEvent ae)
		{
			String s1;
			s1=ae.getActionCommand();
			if(s1.equals("R"))
			{
				setBackground(Color.RED);
			}
			else if(s1.equals("G"))
			{
				setBackground(Color.GREEN);
			}
			else
			{
				setBackground(Color.BLUE);
			}
	}
}

/*
<applet code="event4" width="300" height="300">
</applet>
*/