import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class event3 extends Applet implements ActionListener
{
	TextField t1,t2;
	Button b1,b2;
	Panel p;
	GridLayout gd1,gd2;
	public event3()
	{
		t1=new TextField(20);
		t2=new TextField(20);
		t2.setEditable(false);
		b1=new Button("Copy");
		b2=new Button("Clear");
		gd1=new GridLayout(3,1);
		gd2=new GridLayout(1,2);
		p=new Panel();
		setLayout(gd1);
		add(t1);
		add(t2);
		p.setLayout(gd2);
		add(p);
		p.add(b1);
		p.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		b1.setForeground(Color.BLUE);
		b1.setForeground(Color.RED);
		if(s=="Copy")
		{
			
			t2.setText(t1.getText());
		}
		else
		{
			t1.setText(" ");
			t2.setText(" ");
		}
	}		
}

/*
<applet code="event3" width="300" height="300">
</applet>
*/