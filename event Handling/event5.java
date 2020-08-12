import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class event5 extends Applet implements ActionListener
{
Panel p;
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5;
GridLayout g1,g2;
public event5()
{
	p=new Panel();
	g1=new GridLayout(4,1);
	g2=new GridLayout(1,5);
	t1=new TextField(20);
	t2=new TextField(20);
	t3=new TextField(20);
	t3.setEditable(false);
	b1=new Button("+");
	b2=new Button("-");
	b3=new Button("*");
	b4=new Button("/");
	b5=new Button("CLEAR");
	
	setLayout(g1);
	add(t1);
	add(t2);
	add(p);
	p.setLayout(g2);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	p.add(b5);
	add(t3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
}

public void actionPerformed(ActionEvent ae)
{
	String s1=ae.getActionCommand();
	int a=0,b=0,ans=0;
	float ansF=0; 
	if(!("".equals(t1.getText()) || "".equals(t2.getText()))) 
	{	
		if(s1.equals("+"))
		{
			ans=Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
			t3.setText(""+ans);
			b1.setForeground(Color.RED);
		}
		else if(s1.equals("-"))
		{
			ans=Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
			t3.setText(""+ans);
			b2.setForeground(Color.RED);
		}
		else if(s1.equals("*"))
		{
			ans=Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
			t3.setText(""+ans);
			b3.setForeground(Color.RED);
		}
		else if(s1.equals("/"))
		{
			ansF=Float.parseFloat(t1.getText()) / Float.parseFloat(t2.getText());
			t3.setText(""+ansF);
			b4.setForeground(Color.RED);
		}
		else if(s1.equals("CLEAR"))
		{
			t3.setText("0");	
		}
	}
	else
	{
		t3.setText("Empty Field");
	}
}
}


/*<applet code="event5" height="300" width="300">
</applet>*/