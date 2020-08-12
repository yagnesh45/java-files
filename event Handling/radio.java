import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class radio extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	GridLayout gd;
	Panel p;
	CheckboxGroup cg;
	Color c;
	public radio()
	{
		cg=new CheckboxGroup();
		c1=new Checkbox("red",false,cg);
		c2=new Checkbox("blue",false,cg);
		c3=new Checkbox("green",false,cg);
		gd=new GridLayout(3,1);
		p=new Panel();
		p.setLayout(gd);
		add(p);
		p.add(c1);
		p.add(c2);
		p.add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		String a=(String)ie.getItem();
		int r=0,g=0,b=0;
		if(c1.getState()==true)
			r=255;
		else if(c2.getState()==true)
			b=255;
		else if(c3.getState()==true)
			g=255;
		Color c=new Color(r,g,b);
		setBackground(c);
		p.setBackground(c);
		c1.setBackground(c);
		c2.setBackground(c);
		c3.setBackground(c);
		/*if(c1.getState()==true && c2.getState()==true && c3.getState()==true)
		{
			1.setBackground(null);
			c2.setBackground(null);
			c3.setBackground(null);
			p.setBackground(null);
		}*/
	}
} 

/*
<applet code=radio height=500 width=500>
</applet>*/