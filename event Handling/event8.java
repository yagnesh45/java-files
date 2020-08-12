import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class event8 extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	GridLayout gd;
	Panel p;
	int r=0,g=0,b=0;
	public event8()
	{
		gd=new GridLayout(3,1);
		p=new Panel();
		c1=new Checkbox("Red",true);
		c2=new Checkbox("Green");
		c3=new Checkbox("Blue");
		
		p.setLayout(gd);
		p.add(c1);
		p.add(c2);
		p.add(c3);
		add(p);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);	
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		String c=(String)ie.getItem();
		Color col;
		r=g=b=0;
		if(c1.getState()==true)
		{
			r=255;
		}
		if(c2.getState()==true)
		{
			g=255;
		}
		if(c3.getState()==true)
		{
			b=255;
		}
		col=new Color(r,g,b);
		setBackground(col);
		p.setBackground(col);
		
	}
}
		
/* <applet code="event8" height="500" width="500">
</applet>*/	