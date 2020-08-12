import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class event2 extends Applet implements ActionListener
{
	Button b;
	TextField t1,t2;
	GridLayout gd;
	public event2()
	{
		b=new Button("Copy");
		t1=new TextField(20);
		t2=new TextField(20);
		gd=new GridLayout(3,1);
		add(t1);
		add(t2);
		add(b);
		setLayout(gd);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//setBackground(Color.BLUE);
		t2.setText(t1.getText());
	}
}

/*
<applet code="event2" height="300" width="300">
</applet>
*/
		