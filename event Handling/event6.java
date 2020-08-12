import java.awt.event.*;
import java.awt.*;
import java.applet.Applet;

public class event6 extends Applet implements ActionListener,Runnable
{
	int x=0,y=50,w=50,h=50,f=0,flag=0;
	Button b1,b2;
	Panel p;
	GridLayout gd1;
	
	
	public event6()
	{
		b1=new Button("Start");
		b2=new Button("Stop");
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		Thread t=new Thread(this);
		t.start();
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("Start"))
		{
			flag=1;
		}
		else
		{
			flag=0;
		}
	}
	
	public void paint(Graphics gd)
	{
		gd.drawOval(x,y,w,h);
	}
	
	public void run()
	{
		while(true)
		{
		if(flag==1)
		{	
			if(x+50==getWidth())
				f=1;
			
			if(x==0)
			{
				f=0;
			}	
			
			if(f==1)
			{
				x--;
			}
			else
			{
				x++;
			}
			try
			{
				Thread.sleep(5);
			}
			catch(Exception e){}
			
		}	
		repaint();
		}
	}
}

/* <applet code="event6" height="500" width="500">
</applet>*/